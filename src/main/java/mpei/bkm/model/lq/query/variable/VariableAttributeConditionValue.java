package mpei.bkm.model.lq.query.variable;


public class VariableAttributeConditionValue extends VariableAttributeCondition {
    private String value;

    public VariableAttributeConditionValue(VariableAttribute leftVariable, BinaryOperator binaryOperator, String value) {
        super(leftVariable, binaryOperator);
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
