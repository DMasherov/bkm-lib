package mpei.bkm.converters.scheme2text;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.lss.objectspecification.concept.Concept;
import mpei.bkm.model.structurescheme.Scheme;

/**
 * Class creates text representation of a scheme.
 *
 * @see Scheme
 */
public class Scheme2TextConverter implements Converter<Scheme,String> {
    @Override
    public String convert(Scheme scheme) throws UnconvertableException {
        StringBuffer sb = new StringBuffer("SCHEME '" + scheme.getName() + "':");
        Concept2TextConverter concept2TextConverter = new Concept2TextConverter();
        for (Concept c : scheme.getConceptList()) {
            sb.append(System.getProperty("line.separator")).append(concept2TextConverter.convert(c)).append(".");
        }
        sb.append(System.getProperty("line.separator"));
        sb.append("END");
        return sb.toString();
    }
}
