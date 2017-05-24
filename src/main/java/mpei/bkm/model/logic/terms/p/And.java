package mpei.bkm.model.logic.terms.p;

import mpei.bkm.model.commonfeatures.InnerPart;

public class And extends P {
    @InnerPart
    private P left;
    @InnerPart
    private P right;

    public And(P left, P right) {
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