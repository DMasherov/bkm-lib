package mpei.bkm.model.query.variable;


public class VariableAttributeConditionVariable extends VariableAttributeCondition {
    private VariableAttribute rightVariable;

    public VariableAttributeConditionVariable(VariableAttribute leftVariable, VariableAttribute rightVariable) {
        super(leftVariable, BinaryOperator.EQ);
        this.rightVariable = rightVariable;
    }

    public VariableAttributeConditionVariable(VariableAttribute leftVariable, BinaryOperator b, VariableAttribute rightVariable) {
        super(leftVariable, b);
        this.rightVariable = rightVariable;
    }

    public VariableAttribute getRightVariable() {
        return rightVariable;
    }
}
