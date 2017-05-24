package mpei.bkm.model.logic.terms.p;

import mpei.bkm.model.commonfeatures.InnerPart;
import mpei.bkm.model.logic.terms.l.L;

public class SurrogateVariable extends P {
    @InnerPart
    private L l;
    @InnerPart
    private String surr;

    public SurrogateVariable(L l, String surr) {
        super();

        this.l = l;
        this.surr = surr;
    }

    public L getL() {
        return l;
    }

    public void setL(L l) {
        this.l = l;
    }

    public String getSurr() {
        return surr;
    }

    public void setSurr(String surr) {
        this.surr = surr;
    }
}
