package mpei.bkm.model.lq.query;

import mpei.bkm.model.commonlangfeatures.Selector;

public class AggregateGoal extends Goal {
    public static enum Aggregate {SUM, AVG, MAX, MIN}

    private Aggregate aggregate;

    public AggregateGoal(Selector selector, Aggregate aggregate) {
        super(selector);
        this.aggregate = aggregate;
    }

    public Aggregate getAggregate() {
        return aggregate;
    }
}
