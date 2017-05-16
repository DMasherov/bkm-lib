package mpei.bkm.converters.text2ls;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.lls1.LSOntology;
import mpei.bkm.parsing.lls1.parsers.LLS1BuildingVisitor;
import mpei.bkm.parsing.lls1.parsers.LLS1Lexer;
import mpei.bkm.parsing.lls1.parsers.LLS1Parser;
import mpei.bkm.parsing.common.BKMParseErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.List;

/**
 * Class creates an ontology with only simple expressions {@link mpei.bkm.model.lls1.LSOntology} from text.
 */
public class Text2LSOntology implements Converter<String, LSOntology> {
    private List<String> errors;

    public LSOntology convert(String s) throws UnconvertableException {
        ANTLRInputStream stream = new ANTLRInputStream(s);
        LLS1Lexer lexer = new LLS1Lexer(stream);

        LLS1Parser parser = new LLS1Parser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        BKMParseErrorListener errorListener = new BKMParseErrorListener();
        parser.addErrorListener(errorListener);
        LLS1BuildingVisitor visitor = new LLS1BuildingVisitor();
        LSOntology ont = (LSOntology) visitor.visit(parser.statements());

        errors = errorListener.getErrorMessages();

        if (!errors.isEmpty()) {
            throw new UnconvertableException(errors.toArray(new String[]{}));
        }
        return ont;
    }
    public List<String> getErrors() {
        return errors;
    }
}
