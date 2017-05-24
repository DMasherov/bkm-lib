package mpei.bkm.model.query.variable;

import mpei.bkm.model.query.AggregateGoal;


public class AggregateVariableAttribute extends VariableAttribute {
    private AggregateGoal.Aggregate aggregate;

    public AggregateVariableAttribute(Variable variable, String attrName, AggregateGoal.Aggregate aggregate) {
        super(variable, attrName);
        this.aggregate = aggregate;
    }

    public AggregateGoal.Aggregate getAggregate() {
        return aggregate;
    }
}
