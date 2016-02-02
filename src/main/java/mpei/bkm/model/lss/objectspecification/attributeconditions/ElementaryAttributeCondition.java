package mpei.bkm.model.lss.objectspecification.attributeconditions;

import mpei.bkm.model.commonlangfeatures.Selector;

public class ElementaryAttributeCondition {
    public static enum BinaryOperator {
        EQ, NOTEQ , LT , LE , GT , GE
    }
    private Selector left;
    private BinaryOperator binaryOperator;
    private Selector right;
    public ElementaryAttributeCondition(Selector left, BinaryOperator binaryOperator, Selector right) {
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
