package mpei.bkm.model.logic.statement;

import mpei.bkm.model.commonfeatures.InnerPart;
import mpei.bkm.model.logic.terms.l.L;

public class ExistL extends Statement {
    @InnerPart
    private L l;

    public ExistL(L l) {
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