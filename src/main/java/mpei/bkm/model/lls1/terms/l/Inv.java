package mpei.bkm.model.lls1.terms.l;

import mpei.bkm.model.lls1.InnerPart;

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
