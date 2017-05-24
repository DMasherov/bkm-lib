package mpei.bkm.model.lss.objectspecification.attributeconstraints;

import mpei.bkm.model.commonlangfeatures.Selector;

public class Constraint {
    public enum BinaryOperator {
        EQ, NOTEQ , LT , LE , GT , GE
    }
    private Selector left;
    private BinaryOperator binaryOperator;
    private Selector right;
    public Constraint(Selector left, BinaryOperator binaryOperator, Selector right) {
        this.left = left;
        this.binaryOperator = binaryOperator;
        this.right = right;
    }

    public Selector getLeft() {
        return left;
    }

    public BinaryOperator getBinaryOperator() {
        return binaryOperator;
    }

    public Selector getRight() {
        return right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Constraint that = (Constraint) o;

        if (left != null ? !left.equals(that.left) : that.left != null) return false;
        if (binaryOperator != that.binaryOperator) return false;
        return right != null ? right.equals(that.right) : that.right == null;

    }

    @Override
    public int hashCode() {
        int result = left != null ? left.hashCode() : 0;
        result = 31 * result + (binaryOperator != null ? binaryOperator.hashCode() : 0);
        result = 31 * result + (right != null ? right.hashCode() : 0);
        return result;
    }
}
