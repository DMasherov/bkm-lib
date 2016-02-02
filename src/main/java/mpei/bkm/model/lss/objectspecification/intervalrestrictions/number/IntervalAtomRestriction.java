package mpei.bkm.model.lss.objectspecification.intervalrestrictions.number;

import mpei.bkm.model.lss.objectspecification.intervalrestrictions.AtomRestriction;

public class IntervalAtomRestriction extends AtomRestriction {
    private Integer from;
    private Integer to;

    public IntervalAtomRestriction(Integer from, Integer to) {
        this.from = from;
        this.to = to;
    }

    public Integer getFrom() {
        return from;
    }

    public Integer getTo() {
        return to;
    }
}
