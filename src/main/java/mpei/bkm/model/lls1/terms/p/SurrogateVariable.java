package mpei.bkm.model.lls1.terms.p;

import mpei.bkm.model.lls1.InnerPart;
import mpei.bkm.model.lls1.terms.l.L;

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
