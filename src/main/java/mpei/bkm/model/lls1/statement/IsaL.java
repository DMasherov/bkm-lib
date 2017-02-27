package mpei.bkm.model.lls1.statement;

import mpei.bkm.model.lls1.InnerPart;
import mpei.bkm.model.lls1.terms.l.L;

public class IsaL extends Statement {
    @InnerPart
    private L parent;
    @InnerPart
    private L child;

    public IsaL(L parent, L child) {
        super();

        this.parent = parent;
        this.child = child;
    }

    public L getParent() {
        return parent;
    }

    public void setParent(L parent) {
        this.parent = parent;
    }

    public L getChild() {
        return child;
    }

    public void setChild(L child) {
        this.child = child;
    }
}