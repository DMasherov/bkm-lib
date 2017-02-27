package mpei.bkm.model.lls1.statement;

import edu.emory.mathcs.backport.java.util.Arrays;
import mpei.bkm.model.lls1.Expression;
import mpei.bkm.model.lls1.InnerPart;

import java.util.ArrayList;
import java.util.List;

public class And extends Statement {
    @InnerPart
    private Statement left;
    @InnerPart
    private Statement right;

    public And(Statement left, Statement right) {
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