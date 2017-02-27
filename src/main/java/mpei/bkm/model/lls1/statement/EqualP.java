package mpei.bkm.model.lls1.statement;

import mpei.bkm.model.lls1.InnerPart;
import mpei.bkm.model.lls1.terms.p.P;

public class EqualP extends Statement {
    @InnerPart
    private P left;
    @InnerPart
    private P right;

    public EqualP(P left, P right) {
        super();

        this.left = left;
        this.right = right;
    }

    public P getLeft() {
        return left;
    }

    public void setLeft(P left) {
        this.left = left;
    }

    public P getRight() {
        return right;
    }

    public void setRight(P right) {
        this.right = right;
    }
}