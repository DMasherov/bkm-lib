package mpei.bkm.model.lls1.terms.p;

import mpei.bkm.model.lls1.InnerPart;
import mpei.bkm.model.lls1.terms.l.L;

public class PredicateVariable extends P {
    @InnerPart
    private L l;
    @InnerPart
    private String varName;

    public PredicateVariable(L l, String varName) {
        super();

        this.l = l;
        this.varName = varName;
    }

    public L getL() {
        return l;
    }

    public void setL(L l) {
        this.l = l;
    }

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }
}
