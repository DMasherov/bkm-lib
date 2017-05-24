package mpei.bkm.model.structure.objectspecification.intervalrestrictions;

import mpei.bkm.model.structure.objectspecification.intervalrestrictions.number.AtomNumberRestriction;
import mpei.bkm.model.structure.objectspecification.intervalrestrictions.number.EQAtomRestriction;

public class IntervalRestriction {
    private AtomRestriction left;
    private AtomRestriction right;

    public IntervalRestriction(AtomRestriction left, AtomRestriction right) {
        this.left = left;
        this.right = right;
    }

    public AtomRestriction getLeft() {
        return left;
    }

    public AtomRestriction getRight() {
        return right;
    }

    public boolean isFunctional() {
        return left instanceof EQAtomRestriction
                && ((AtomNumberRestriction) left).getValue() == 1
                && right instanceof StarAtomRestriction;
    }
}
