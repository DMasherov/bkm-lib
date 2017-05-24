package mpei.bkm.model.logic.terms.c;

import mpei.bkm.model.commonfeatures.InnerPart;
import mpei.bkm.model.logic.terms.p.P;

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
