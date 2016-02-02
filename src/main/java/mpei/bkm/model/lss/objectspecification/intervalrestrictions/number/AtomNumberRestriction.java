package mpei.bkm.model.lss.objectspecification.intervalrestrictions.number;

import mpei.bkm.model.lss.objectspecification.intervalrestrictions.AtomRestriction;

public abstract class AtomNumberRestriction extends AtomRestriction {
    private Integer value;

    public AtomNumberRestriction(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
