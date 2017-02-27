package mpei.bkm.model.lls1.terms.p;

import mpei.bkm.model.lls1.InnerPart;
import mpei.bkm.model.lls1.terms.c.C;
import mpei.bkm.model.lls1.terms.l.L;

public class Only extends P {
    @InnerPart
    private L l;
    @InnerPart
    private C c;

    public Only(L l, C c) {
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
