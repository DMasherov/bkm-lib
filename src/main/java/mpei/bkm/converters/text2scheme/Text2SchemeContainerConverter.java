package mpei.bkm.converters.text2scheme;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.lss.objectspecification.attributes.ConceptAttribute;
import mpei.bkm.model.lss.objectspecification.concepttypes.BKMClassType;
import mpei.bkm.parsing.structurescheme.parsers.StructureSchemeParser;
import mpei.bkm.parsing.structurescheme.parsers.StructureSchemeBuildingVisitor;
import mpei.bkm.parsing.structurescheme.parsers.StructureSchemeErrorListener;
import mpei.bkm.parsing.structurescheme.parsers.StructureSchemeLexer;
import mpei.bkm.parsing.structurescheme.parsers.schemeparseinfo.ConceptAttributePositioning;
import mpei.bkm.parsing.structurescheme.parsers.schemeparseinfo.Positioning;
import mpei.bkm.model.structurescheme.Scheme;
import mpei.bkm.parsing.structurescheme.SchemeContainer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Class creates a scheme from its text representation.
 *
 * @see Scheme
 */
public class Text2SchemeContainerConverter implements Converter<String,SchemeContainer> {

    private SchemeContainer schemeContainer;
    private List<String> errors;

    @Override
    public SchemeContainer convert(String s) throws UnconvertableException {
        ANTLRInputStream stream = new ANTLRInputStream(s);
        StructureSchemeLexer lexer = new StructureSchemeLexer(stream);

        StructureSchemeParser parser = new StructureSchemeParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        StructureSchemeErrorListener structureSchemeErrorListener = new StructureSchemeErrorListener();
        parser.addErrorListener(structureSchemeErrorListener);

        StructureSchemeBuildingVisitor v = new StructureSchemeBuildingVisitor();
        Object oscheme = v.visit(parser.scheme());
        Scheme scheme = null;
        if (oscheme != null) {
            scheme = (Scheme) oscheme;
        }
        schemeContainer = new SchemeContainer(scheme);
        errors = structureSchemeErrorListener.getErrorMessages();
        return schemeContainer;
    }

    public List<String> getIncompleteness() {
        List<String> incompleteness = new ArrayList<String>();
        for (Map.Entry<BKMClassType, List<ConceptAttribute>> entry : schemeContainer.getUndefinedConceptsInAttributes().entrySet()) {
            for (ConceptAttribute attribute : entry.getValue()) {
                String position = "";
                if (attribute instanceof ConceptAttributePositioning) {
                    Positioning positioning = ((ConceptAttributePositioning) attribute).getPositioning();
                    position = String.format("on line %s; pos %s",positioning.getLine(),positioning.getCharPositionInLine());
                }
                incompleteness.add(String.format("Undefined class '%s' for attribute '%s' in concept %s %s",
                        entry.getKey().getBKMClass().getName(),
                        attribute.getName(),
                        attribute.getConcept().getName(),
                        position));
            }
        }
        return incompleteness;
    }

    public List<String> getErrors() {
        return errors;
    }

}
