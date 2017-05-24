package mpei.bkm.model.structure.datatypespecification.datatypes;

public class LListDataType extends DataType {
    private DataType type;

    public LListDataType(DataType type) {
        this.type = type;
    }

    public DataType getType() {
        return type;
    }
}
