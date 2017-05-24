package mpei.bkm.model.query.variable;


public class ConditionVariableAttribute extends VariableAttribute {
    private String value;

    public ConditionVariableAttribute(Variable variable, String attrName, String value) {
        super(variable, attrName);
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
