package mpei.bkm.model.structure.datatypespecification.datatypes;

public class LListDataType extends DataType {
    private DataType type;

    public LListDataType(DataType type) {
        this.type = type;
    }

    public DataType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LListDataType)) return false;

        LListDataType that = (LListDataType) o;

        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return type != null ? type.hashCode() : 0;
    }
}
