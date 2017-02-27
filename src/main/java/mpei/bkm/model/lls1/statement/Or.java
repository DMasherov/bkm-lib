package mpei.bkm.model.lls1.statement;

import mpei.bkm.model.lls1.InnerPart;

public class Or extends Statement {
    @InnerPart
    private Statement left;
    @InnerPart
    private Statement right;

    public Or(Statement left, Statement right) {
        super();

        this.left = left;
        this.right = right;
    }

    public Statement getLeft() {
        return left;
    }

    public void setLeft(Statement left) {
        this.left = left;
    }

    public Statement getRight() {
        return right;
    }

    public void setRight(Statement right) {
        this.right = right;
    }
}