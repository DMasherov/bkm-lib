package mpei.bkm.model.lls1.terms.c;

import mpei.bkm.model.lls1.InnerPart;
import mpei.bkm.model.lls1.terms.p.P;

public class Those extends C {
    @InnerPart
    private P p;

    public Those(P p) {
        super();

        this.p = p;
    }

    public P getP() {
        return p;
    }

    public void setP(P p) {
        this.p = p;
    }
}
