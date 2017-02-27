package mpei.bkm.model.lls1.terms.c;

import mpei.bkm.model.lls1.InnerPart;
import mpei.bkm.model.lls1.terms.p.P;

public class That extends C {
    @InnerPart
    private C c;
    @InnerPart
    private P p;

    public That(C c, P p) {
        super();

        this.c = c;
        this.p = p;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }

    public P getP() {
        return p;
    }

    public void setP(P p) {
        this.p = p;
    }
}
