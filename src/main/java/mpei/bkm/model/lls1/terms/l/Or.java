package mpei.bkm.model.lls1.terms.l;

import mpei.bkm.model.lls1.InnerPart;

public class Or extends L {
    @InnerPart
    private L left;
    @InnerPart
    private L right;

    public Or(L left, L right) {
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
