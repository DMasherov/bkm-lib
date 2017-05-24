package mpei.bkm.model.structure.objectspecification.intervalrestrictions.number;

import mpei.bkm.model.structure.objectspecification.intervalrestrictions.AtomRestriction;

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
