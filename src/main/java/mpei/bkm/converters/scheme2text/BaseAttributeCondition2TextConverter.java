package mpei.bkm.converters.scheme2text;

import mpei.bkm.model.lss.objectspecification.attributeconditions.ElementaryAttributeCondition;
import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.lss.objectspecification.attributeconditions.BaseAttributeCondition;
import org.apache.commons.lang.StringUtils;

public class BaseAttributeCondition2TextConverter implements Converter<BaseAttributeCondition,String> {
    @Override
    public String convert(BaseAttributeCondition baseAttributeCondition) throws UnconvertableException {
        if (baseAttributeCondition == null)
            return "";
        StringBuffer sb = new StringBuffer();
        sb.append("(");
        boolean first = true;

        for (ElementaryAttributeCondition elementaryAttributeCondition : baseAttributeCondition.getElementaryAttributeConditions()) {
            if (!first) {
                sb.append(",");
            }
            first = false;
            sb.append(StringUtils.join(elementaryAttributeCondition.getLeft().getSelects(), ";"));
            ElementaryAttributeCondition.BinaryOperator op = elementaryAttributeCondition.getBinaryOperator();
            if (op == ElementaryAttributeCondition.BinaryOperator.EQ) sb.append("=");
            else if (op == ElementaryAttributeCondition.BinaryOperator.NOTEQ) sb.append("=/=");
            else if (op == ElementaryAttributeCondition.BinaryOperator.LT) sb.append("<");
            else if (op == ElementaryAttributeCondition.BinaryOperator.LE) sb.append("<=");
            else if (op == ElementaryAttributeCondition.BinaryOperator.GT) sb.append(">");
            else if (op == ElementaryAttributeCondition.BinaryOperator.GE) sb.append(">=");
            sb.append(StringUtils.join(elementaryAttributeCondition.getRight().getSelects(), ";"));

        }
        sb.append(")");
        return sb.toString();
    }
}