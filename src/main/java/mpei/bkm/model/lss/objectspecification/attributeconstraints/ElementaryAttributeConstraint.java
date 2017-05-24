package mpei.bkm.model.lss.objectspecification.attributeconstraints;

import mpei.bkm.model.commonlangfeatures.Selector;

public class ElementaryAttributeConstraint {
    public enum BinaryOperator {
        EQ, NOTEQ , LT , LE , GT , GE
    }
    private Selector left;
    private BinaryOperator binaryOperator;
    private Selector right;
    public ElementaryAttributeConstraint(Selector left, BinaryOperator binaryOperator, Selector right) {
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
}
