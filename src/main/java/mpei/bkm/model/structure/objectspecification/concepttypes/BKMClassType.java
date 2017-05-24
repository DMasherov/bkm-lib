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


}
