package mpei.bkm.converters.structure2text;

import mpei.bkm.model.structure.objectspecification.attributeconstraints.Constraint;
import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.structure.objectspecification.attributeconstraints.AttributeConstraints;
import org.apache.commons.lang.StringUtils;

public class BaseAttributeCondition2Text implements Converter<AttributeConstraints,String> {
    @Override
    public String convert(AttributeConstraints attributeConstraints) throws UnconvertableException {
        if (attributeConstraints == null)
            return "";
        StringBuffer sb = new StringBuffer();
        sb.append("(");
        boolean first = true;

        for (Constraint constraint : attributeConstraints.getConstraints()) {
            if (!first) {
                sb.append(",");
            }
            first = false;
            sb.append(StringUtils.join(constraint.getLeft().getSelects(), ";"));
            Constraint.BinaryOperator op = constraint.getBinaryOperator();
            if (op == Constraint.BinaryOperator.EQ) sb.append("=");
            else if (op == Constraint.BinaryOperator.NOTEQ) sb.append("=/=");
            else if (op == Constraint.BinaryOperator.LT) sb.append("<");
            else if (op == Constraint.BinaryOperator.LE) sb.append("<=");
            else if (op == Constraint.BinaryOperator.GT) sb.append(">");
            else if (op == Constraint.BinaryOperator.GE) sb.append(">=");
            sb.append(StringUtils.join(constraint.getRight().getSelects(), ";"));

        }
        sb.append(")");
        return sb.toString();
    }
}