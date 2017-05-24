package mpei.bkm.model.logic.terms.p;

import mpei.bkm.model.commonfeatures.InnerPart;
import mpei.bkm.model.logic.terms.c.C;
import mpei.bkm.model.logic.terms.l.L;

public class Some extends P {
    @InnerPart
    private L l;
    @InnerPart
    private C c;

    public Some(L l, C c) {
        super();

        this.l = l;
        this.c = c;
    }

    public L getL() {
        return l;
    }

    public void setL(L l) {
        this.l = l;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }
}
