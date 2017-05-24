package mpei.bkm.model.logic.statement;

import mpei.bkm.model.commonfeatures.InnerPart;
import mpei.bkm.model.logic.terms.c.C;

public class NullC extends Statement {
    @InnerPart
    private C c;

    public NullC(C c) {
        super();

        this.c = c;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }
}