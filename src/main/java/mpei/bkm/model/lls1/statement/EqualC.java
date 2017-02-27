package mpei.bkm.model.lls1.statement;

import mpei.bkm.model.lls1.InnerPart;
import mpei.bkm.model.lls1.terms.c.C;

public class EqualC extends Statement {
    @InnerPart
    private C left;
    @InnerPart
    private C right;

    public EqualC(C left, C right) {
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