package mpei.bkm.model.logic.terms.l;

import mpei.bkm.model.commonfeatures.InnerPart;

public class Not extends L {
    @InnerPart
    private L l;

    public Not(L l) {
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
