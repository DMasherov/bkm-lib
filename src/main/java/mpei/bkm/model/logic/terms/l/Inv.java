package mpei.bkm.model.logic.terms.l;

import mpei.bkm.model.commonfeatures.InnerPart;

public class Inv extends L {
    @InnerPart
    private L l;

    public Inv(L l) {
        super();

        this.l = l;
    }

    public L getL() {
        return l;
    }

    public void setL(L l) {
        this.l = l;
    }
}
