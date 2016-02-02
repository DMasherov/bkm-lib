package mpei.bkm.model.lq.query.variable;


public class VariableAttribute {
    private Variable variable;
    private String attrName;

    public VariableAttribute(Variable variable, String attrName) {
        this.variable = variable;
        this.attrName = attrName;
    }

    public Variable getVariable() {
        return variable;
    }

    public String getAttrName() {
        return attrName;
    }
}
