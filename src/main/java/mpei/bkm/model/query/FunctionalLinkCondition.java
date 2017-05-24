package mpei.bkm.model.query;


public class FunctionalLinkCondition extends Condition {
    private String linkName;
    private String variableName;
    private OperatorCondition operatorCondition;

    public FunctionalLinkCondition(String linkName, String variableName, OperatorCondition operatorCondition) {
        this.linkName = linkName;
        this.variableName = variableName;
        this.operatorCondition = operatorCondition;
    }

    public String getLinkName() {
        return linkName;
    }

    public String getVariableName() {
        return variableName;
    }

    public OperatorCondition getOperatorCondition() {
        return operatorCondition;
    }
}
