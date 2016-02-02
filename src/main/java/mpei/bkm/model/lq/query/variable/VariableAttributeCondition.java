package mpei.bkm.model.lq.query.variable;

import mpei.bkm.model.lq.query.Condition;


public class VariableAttributeCondition extends Condition {
    public static enum BinaryOperator {EQ, NOTEQ, GT, GE, LT, LE, LIKE}

    private VariableAttribute leftVariable;
    protected BinaryOperator binaryOperator;

    public VariableAttributeCondition(VariableAttribute leftVariable, BinaryOperator binaryOperator) {
        this.leftVariable = leftVariable;
        this.binaryOperator = binaryOperator;
    }

    public VariableAttribute getLeftVariable() {
        return leftVariable;
    }

    public BinaryOperator getBinaryOperator() {
        return binaryOperator;
    }
}
