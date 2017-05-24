package mpei.bkm.converters.scheme2text;

import mpei.bkm.model.lss.objectspecification.attributeconstraints.ElementaryAttributeConstraint;
import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.lss.objectspecification.attributeconstraints.AttributeConstraints;
import org.apache.commons.lang.StringUtils;

public class BaseAttributeCondition2Text implements Converter<AttributeConstraints,String> {
    @Override
    public String convert(AttributeConstraints attributeConstraints) throws UnconvertableException {
        if (attributeConstraints == null)
            return "";
        StringBuffer sb = new StringBuffer();
        sb.append("(");
        boolean first = true;

        for (ElementaryAttributeConstraint elementaryAttributeCondition : attributeConstraints.getElementaryAttributeConstraint()) {
            if (!first) {
                sb.append(",");
            }
            first = false;
            sb.append(StringUtils.join(elementaryAttributeCondition.getLeft().getSelects(), ";"));
            ElementaryAttributeConstraint.BinaryOperator op = elementaryAttributeCondition.getBinaryOperator();
            if (op == ElementaryAttributeConstraint.BinaryOperator.EQ) sb.append("=");
            else if (op == ElementaryAttributeConstraint.BinaryOperator.NOTEQ) sb.append("=/=");
            else if (op == ElementaryAttributeConstraint.BinaryOperator.LT) sb.append("<");
            else if (op == ElementaryAttributeConstraint.BinaryOperator.LE) sb.append("<=");
            else if (op == ElementaryAttributeConstraint.BinaryOperator.GT) sb.append(">");
            else if (op == ElementaryAttributeConstraint.BinaryOperator.GE) sb.append(">=");
            sb.append(StringUtils.join(elementaryAttributeCondition.getRight().getSelects(), ";"));

        }
        sb.append(")");
        return sb.toString();
    }
}