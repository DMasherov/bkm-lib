package mpei.bkm.model.logic.statement;

import mpei.bkm.model.commonfeatures.InnerPart;
import mpei.bkm.model.logic.terms.l.L;

public class EqualL extends Statement {
    @InnerPart
    private L left;
    @InnerPart
    private L right;

    public EqualL(L left, L right) {
        super();

        this.left = left;
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public void setLeft(L left) {
        this.left = left;
    }

    public L getRight() {
        return right;
    }

    public void setRight(L right) {
        this.right = right;
    }
}