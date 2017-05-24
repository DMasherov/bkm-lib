package mpei.bkm.model.query.variable;

import mpei.bkm.model.query.Condition;


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
