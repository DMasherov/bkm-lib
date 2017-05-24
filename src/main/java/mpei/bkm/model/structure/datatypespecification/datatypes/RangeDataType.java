package mpei.bkm.model.structure.datatypespecification.datatypes;

public class RangeDataType extends DataType {
    private String left;
    private String right;

    public RangeDataType(String left, String right) {
        this.left = left;
        this.right = right;
    }

    public String getLeft() {
        return left;
    }

    public String getRight() {
        return right;
    }
}
