package mpei.bkm.model.lls1.statement;

import mpei.bkm.model.lls1.InnerPart;
import mpei.bkm.model.lls1.terms.c.C;

public class IsaC extends Statement {
    @InnerPart
    private C sub;
    @InnerPart
    private C sup;

    public IsaC(C sub, C sup) {
        super();

        this.sub = sub;
        this.sup = sup;
    }

    public C getSub() {
        return sub;
    }

    public void setSub(C sub) {
        this.sub = sub;
    }

    public C getSup() {
        return sup;
    }

    public void setSup(C sup) {
        this.sup = sup;
    }
}