package mpei.bkm.converters.scheme2text;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.lss.objectspecification.concept.BinaryLink;

public class BinaryLink2TextConverter implements Converter<BinaryLink,String> {

    @Override
    public String convert(BinaryLink binaryLink) throws UnconvertableException {
        if (binaryLink == null) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        Attributes2TextConverter attributes2TextConverter = new Attributes2TextConverter();
        ClassAttributeCondition2TextConverter classAttributeCondition2TextConverter = new ClassAttributeCondition2TextConverter();
        IntervalRestriction2TextConverter intervalRestriction2TextConverter = new IntervalRestriction2TextConverter();
        sb.append("(");
        sb.append(classAttributeCondition2TextConverter.convert(binaryLink.getLeft())).append(" ");
        sb.append(binaryLink.getName());
        if (binaryLink.getRestriction() != null) {
            sb.append(intervalRestriction2TextConverter.convert(binaryLink.getRestriction()));
        }
        sb.append(" ");
        sb.append(classAttributeCondition2TextConverter.convert(binaryLink.getRight()));
        sb.append(")");
        sb.append(attributes2TextConverter.convert(binaryLink.getAttributes()));
        return sb.toString();
    }
}
