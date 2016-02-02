package mpei.bkm.model.lq.query;

import mpei.bkm.model.commonlangfeatures.Selector;


public class OperatorConditionSelector extends OperatorCondition {
    private Selector rightSelector;

    public OperatorConditionSelector(Selector leftSelector,SelectBinaryOperator selectBinaryOperator, Selector rightSelector) {
        super(leftSelector,selectBinaryOperator);
        this.rightSelector = rightSelector;
    }

    public Selector getRightSelector() {
        return rightSelector;
    }
}
