package mpei.bkm.model.structure.objectspecification.intervalrestrictions.number;

import mpei.bkm.model.structure.objectspecification.intervalrestrictions.AtomRestriction;

public abstract class AtomNumberRestriction extends AtomRestriction {
    private Integer value;

    public AtomNumberRestriction(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
