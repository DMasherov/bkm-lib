package mpei.bkm.model.lls1.statement;

import mpei.bkm.model.lls1.InnerPart;
import mpei.bkm.model.lls1.terms.l.L;

public class NullL extends Statement {
    @InnerPart
    private L l;

    public NullL(L l) {
        super();

        this.l = l;
    }

    public L getL() {
        return l;
    }

    public void setL(L l) {
        this.l = l;
    }
}