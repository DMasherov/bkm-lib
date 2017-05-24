package mpei.bkm.converters.structure2text;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.logic.LSOntology;
import mpei.bkm.model.structure.objectspecification.concept.Concept;

import java.util.HashSet;
import java.util.Set;

/**
 * Class creates text representation of a scheme.
 *
 * @see LSOntology
 */
public class LSOntologyStructure2Text implements Converter<LSOntology,String> {
    @Override
    public String convert(LSOntology ont) throws UnconvertableException {
        StringBuffer sb = new StringBuffer("SCHEME '" + ont.getName() + "':");
        Concept2Text concept2TextConverter = new Concept2Text();

        Set<Concept> concepts = new HashSet<>();
        concepts.addAll(ont.getClasses());
        concepts.addAll(ont.getBinaryLinks());

        for (Concept c : concepts) {
            sb.append(System.getProperty("line.separator")).append(concept2TextConverter.convert(c)).append(".");
        }
        sb.append(System.getProperty("line.separator"));
        sb.append("END");
        return sb.toString();
    }
}
