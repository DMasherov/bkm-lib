package mpei.bkm.model.structure.objectspecification.concepttypes;

import mpei.bkm.model.structure.objectspecification.concept.BKMClass;

public class BKMClassType extends ConceptType {
    private BKMClass BKMClass;

    public BKMClassType(BKMClass BKMClass) {
        this.BKMClass = BKMClass;
    }

    public BKMClass getBKMClass() {
        return BKMClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BKMClassType)) return false;

        BKMClassType that = (BKMClassType) o;

        if (BKMClass != null ? !BKMClass.equals(that.BKMClass) : that.BKMClass != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return BKMClass != null ? BKMClass.hashCode() : 0;
    }
}
