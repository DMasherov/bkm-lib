package mpei.bkm.model.lls1.terms.c;

import mpei.bkm.model.lls1.InnerPart;

public class Or extends C {
    @InnerPart
    private C left;
    @InnerPart
    private C right;

    public Or(C left, C right) {
        super();

        this.left = left;
        this.right = right;
    }

    public C getLeft() {
        return left;
    }

    public void setLeft(C left) {
        this.left = left;
    }

    public C getRight() {
        return right;
    }

    public void setRight(C right) {
        this.right = right;
    }
}
