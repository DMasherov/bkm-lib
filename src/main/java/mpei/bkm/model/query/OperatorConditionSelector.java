package mpei.bkm.model.query;

import mpei.bkm.model.commonfeatures.Selector;


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
