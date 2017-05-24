package mpei.bkm.model.logic.terms.c;

import mpei.bkm.model.commonfeatures.InnerPart;

public class Not extends C {
    @InnerPart
    private C c;

    public Not(C c) {
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
