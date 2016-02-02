package mpei.bkm.model.lq.query;

import mpei.bkm.model.commonlangfeatures.Selector;


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
