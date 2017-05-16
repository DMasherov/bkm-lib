package mpei.bkm.model.lls1.terms.c;

import mpei.bkm.model.lss.objectspecification.concept.BKMClass;

public class Named extends C {
    private BKMClass bkmClass;

    public Named(BKMClass bkmClass) {
        this.bkmClass = bkmClass;
    }

    public void setBkmClass(BKMClass bkmClass) {
        this.bkmClass = bkmClass;
    }

    public BKMClass getBkmClass() {
        return bkmClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Named)) return false;

        Named named = (Named) o;

        if (bkmClass != null ? !bkmClass.equals(named.bkmClass) : named.bkmClass != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return bkmClass != null ? bkmClass.hashCode() : 0;
    }
}
