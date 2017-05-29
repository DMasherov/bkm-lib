package mpei.bkm.model.structure.datatypespecification.datatypes;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UnionDataType)) return false;

        UnionDataType that = (UnionDataType) o;

        if (left != null ? !left.equals(that.left) : that.left != null) return false;
        if (right != null ? !right.equals(that.right) : that.right != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = left != null ? left.hashCode() : 0;
        result = 31 * result + (right != null ? right.hashCode() : 0);
        return result;
    }
}
