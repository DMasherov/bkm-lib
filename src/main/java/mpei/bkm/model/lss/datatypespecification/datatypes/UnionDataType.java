package mpei.bkm.model.lss.datatypespecification.datatypes;

public class UnionDataType extends DataType {
    private DataType left;
    private DataType right;

    public UnionDataType(DataType left, DataType right) {
        this.left = left;
        this.right = right;
    }

    public DataType getLeft() {
        return left;
    }

    public DataType getRight() {
        return right;
    }
}
