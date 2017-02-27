package mpei.bkm.model.lls1.statement;

import mpei.bkm.model.lls1.InnerPart;
import mpei.bkm.model.lls1.terms.c.C;
import mpei.bkm.model.lls1.terms.p.P;

public class Some extends Statement {
    @InnerPart
    private C c;
    @InnerPart
    private P p;

    public Some(C c, P p) {
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