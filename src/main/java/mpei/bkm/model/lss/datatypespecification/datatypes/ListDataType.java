package mpei.bkm.model.lss.datatypespecification.datatypes;

public class ListDataType extends DataType {
    private DataType type;

    public ListDataType(DataType type) {
        this.type = type;
    }

    public DataType getType() {
        return type;
    }
}
