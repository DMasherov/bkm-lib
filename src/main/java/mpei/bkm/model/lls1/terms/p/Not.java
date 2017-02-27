package mpei.bkm.model.lls1.terms.p;

import mpei.bkm.model.lls1.InnerPart;

public class Not extends P {
    @InnerPart
    private P not;

    public Not(P not) {
        super();

        this.not = not;
    }

    public P getNot() {
        return not;
    }

    public void setNot(P not) {
        this.not = not;
    }
}
