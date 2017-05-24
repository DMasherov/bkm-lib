package mpei.bkm.model.query;

import java.util.ArrayList;
import java.util.List;


public class InClass extends Condition {
    private String variableName;
    private String className;
    private List<OperatorCondition> operatorConditions = new ArrayList<OperatorCondition>();

    public InClass(String variableName, String className, List<OperatorCondition> operatorConditions) {
        this.variableName = variableName;
        this.className = className;
        this.operatorConditions = operatorConditions;
    }

    public String getVariableName() {
        return variableName;
    }

    public String getClassName() {
        return className;
    }

    public List<OperatorCondition> getOperatorConditions() {
        return operatorConditions;
    }

    public boolean hasNoConditions() {
        return operatorConditions == null || operatorConditions.size() == 0;
    }
}
