package mpei.bkm.model.lls1.statement;

import mpei.bkm.model.lls1.InnerPart;
import mpei.bkm.model.lls1.terms.c.C;

public class IsaC extends Statement {
    @InnerPart
    private C parent;
    @InnerPart
    private C child;

    public IsaC(C parent, C child) {
        super();

        this.parent = parent;
        this.child = child;
    }

    public C getParent() {
        return parent;
    }

    public void setParent(C parent) {
        this.parent = parent;
    }

    public C getChild() {
        return child;
    }

    public void setChild(C child) {
        this.child = child;
    }
}