package mpei.bkm.model.lq.query;

import mpei.bkm.model.commonlangfeatures.Selector;


public class OperatorCondition  extends Condition {
    public static enum SelectBinaryOperator {EQ, NOTEQ, GT, GE, LT, LE, LIKE}

    private Selector leftSelector;
    protected SelectBinaryOperator selectBinaryOperator;
    private boolean isArtificial;

    public OperatorCondition(Selector leftSelector,SelectBinaryOperator selectBinaryOperator) {
        this.leftSelector = leftSelector;
        this.selectBinaryOperator = selectBinaryOperator;
    }

    public OperatorCondition(Selector leftSelector, SelectBinaryOperator selectBinaryOperator, boolean isArtificial) {
        this.leftSelector = leftSelector;
        this.isArtificial = isArtificial;
        this.selectBinaryOperator = selectBinaryOperator;
    }

    public Selector getLeftSelector() {
        return leftSelector;
    }

    public boolean isArtificial() {
        return isArtificial;
    }

    public SelectBinaryOperator getSelectBinaryOperator() {
        return selectBinaryOperator;
    }
}
