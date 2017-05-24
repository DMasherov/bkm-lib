package mpei.bkm.model.logic.statement;

import mpei.bkm.model.commonfeatures.InnerPart;
import mpei.bkm.model.logic.terms.c.C;
import mpei.bkm.model.logic.terms.p.P;

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