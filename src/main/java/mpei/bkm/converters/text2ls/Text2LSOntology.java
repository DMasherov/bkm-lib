package mpei.bkm.converters.text2ls;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.logic.OntologyChecker;
import mpei.bkm.model.logic.LSOntology;
import mpei.bkm.model.commonfeatures.Undeclared;
import mpei.bkm.parsing.common.BKMParseErrorListener;
import mpei.bkm.parsing.ls.parsers.LSBuildingVisitor;
import mpei.bkm.parsing.ls.parsers.LSLexer;
import mpei.bkm.parsing.ls.parsers.LSParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Class reads {@link mpei.bkm.model.logic.LSOntology}.
 */
public class Text2LSOntology implements Converter<String, LSOntology> {
    private List<String> parseErrors;

    public LSOntology convert(String s) throws UnconvertableException {
        ANTLRInputStream stream = new ANTLRInputStream(s);
        LSLexer lexer = new LSLexer(stream);

        LSParser parser = new LSParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        BKMParseErrorListener errorListener = new BKMParseErrorListener();
        parser.addErrorListener(errorListener);
        LSBuildingVisitor visitor = new LSBuildingVisitor();

        LSOntology ont = (LSOntology) visitor.visit(parser.ontology());

        parseErrors = errorListener.getErrorMessages();

        if (!parseErrors.isEmpty()) {
            throw new UnconvertableException(parseErrors.toArray(new String[parseErrors.size()]));
        }

        OntologyChecker ontologyChecker = new OntologyChecker(ont);

        if (!ontologyChecker.getUndeclaredClasses().isEmpty()) {
            Set<String> undeclared = ontologyChecker.getUndeclaredClasses().stream()
                    .map(Undeclared::toString)
                    .collect(Collectors.toSet());
            throw new UnconvertableException(
                    undeclared.toArray(new String[undeclared.size()]));
        }

        if (!ontologyChecker.getDuplicated().isEmpty()) {
            Set<String> duplicated = ontologyChecker.getDuplicated().stream()
                    .map(n -> "Duplicated declaration: " + n)
                    .collect(Collectors.toSet());
            throw new UnconvertableException(
                    duplicated.toArray(new String[duplicated.size()]));
        }
        return ont;
    }
    public List<String> getParseErrors() {
        return parseErrors;
    }
}
