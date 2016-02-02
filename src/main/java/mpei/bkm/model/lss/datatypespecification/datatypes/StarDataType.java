package mpei.bkm.model.lss.datatypespecification.datatypes;

public class StarDataType extends DataType {
    private DataType type;

    public StarDataType(DataType type) {
        this.type = type;
    }

    public DataType getType() {
        return type;
    }
}
