package mpei.bkm.model.lls1.statement;

import mpei.bkm.model.lls1.InnerPart;
import mpei.bkm.model.lls1.terms.l.L;

public class IsaL extends Statement {
    @InnerPart
    private L sub;
    @InnerPart
    private L sup;

    public IsaL(L sub, L sup) {
        super();

        this.sub = sub;
        this.sup = sup;
    }

    public L getSub() {
        return sub;
    }

    public void setSub(L sub) {
        this.sub = sub;
    }

    public L getSup() {
        return sup;
    }

    public void setSup(L sup) {
        this.sup = sup;
    }
}