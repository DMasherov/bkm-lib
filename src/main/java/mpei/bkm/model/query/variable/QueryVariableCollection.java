package mpei.bkm.model.query.variable;

import java.util.ArrayList;
import java.util.List;


public class QueryVariableCollection {
    private List<VariableAttribute> goals = new ArrayList<VariableAttribute>();
    private List<AggregateVariableAttribute> aggregateGoals = new ArrayList<AggregateVariableAttribute>();

    private List<Variable> classCondition = new ArrayList<Variable>();
    private List<VariableLink> links = new ArrayList<VariableLink>();

    private List<VariableAttributeConditionValue> valueConditions = new ArrayList<VariableAttributeConditionValue>();
    private List<VariableAttributeConditionVariable> variableConditions = new ArrayList<VariableAttributeConditionVariable>();
    public List<VariableAttribute> getGoals() {
        return goals;
    }

    public void setGoals(List<VariableAttribute> goals) {
        this.goals = goals;
    }

    public List<AggregateVariableAttribute> getAggregateGoals() {
        return aggregateGoals;
    }

    public void setAggregateGoals(List<AggregateVariableAttribute> aggregateGoals) {
        this.aggregateGoals = aggregateGoals;
    }

    public List<Variable> getClassCondition() {
        return classCondition;
    }

    public void setClassCondition(List<Variable> classCondition) {
        this.classCondition = classCondition;
    }

    public List<VariableAttributeConditionValue> getValueConditions() {
        return valueConditions;
    }

    public void setValueConditions(List<VariableAttributeConditionValue> valueConditions) {
        this.valueConditions = valueConditions;
    }

    public List<VariableAttributeConditionVariable> getVariableConditions() {
        return variableConditions;
    }

    public void setVariableConditions(List<VariableAttributeConditionVariable> variableConditions) {
        this.variableConditions = variableConditions;
    }

    public List<VariableLink> getLinks() {
        return links;
    }

    public void setLinks(List<VariableLink> links) {
        this.links = links;
    }
}
