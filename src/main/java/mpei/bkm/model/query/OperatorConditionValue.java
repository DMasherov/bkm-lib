package mpei.bkm.model.query;

import mpei.bkm.model.commonfeatures.Selector;


public class OperatorConditionValue extends OperatorCondition {
    private String value;

    public OperatorConditionValue(Selector leftSelector,SelectBinaryOperator selectBinaryOperator, String value) {
        super(leftSelector,selectBinaryOperator);
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
