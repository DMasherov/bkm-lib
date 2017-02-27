package mpei.bkm.model.lls1.statement;

import mpei.bkm.model.lls1.InnerPart;
import mpei.bkm.model.lls1.terms.c.C;

public class ExistC extends Statement {
    @InnerPart
    private C c;

    public ExistC(C c) {
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