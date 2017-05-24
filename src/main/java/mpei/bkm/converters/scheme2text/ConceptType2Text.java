package mpei.bkm.converters.scheme2text;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.lss.objectspecification.concepttypes.*;

public class ConceptType2Text implements Converter<ConceptType,String> {

    @Override
    public String convert(ConceptType conceptType) throws UnconvertableException {
        if (conceptType instanceof BKMClassType) {
            return ((BKMClassType)conceptType).getBKMClass().getName();
        }
        ConceptType2Text conceptType2TextConverter = new ConceptType2Text();
        if (conceptType instanceof UnionConceptType) {
            return conceptType2TextConverter.convert(((UnionConceptType) conceptType).getLeft()) +
                    "|" + conceptType2TextConverter.convert(((UnionConceptType) conceptType).getRight());
        }
        else if (conceptType instanceof StarConceptType) {
            return conceptType2TextConverter.convert(((StarConceptType) conceptType).getType()) + "(*)";
        }
        else if (conceptType instanceof CartessianProductConceptType) {
            StringBuffer sb = new StringBuffer();
            sb.append("(");
            boolean first = true;
            for(ConceptType t : ((CartessianProductConceptType) conceptType).getTypes()) {
                if (!first) {
                    sb.append(",");
                }
                first = true;
                sb.append(conceptType2TextConverter.convert(t));
            }
            sb.append(")");
            return sb.toString();
        }
        throw new UnconvertableException("Unknown concept type");

    }
}