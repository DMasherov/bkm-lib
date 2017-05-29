package mpei.bkm.model.structure.datatypespecification.datatypes;

public class ListDataType extends DataType {
    private DataType type;

    public ListDataType(DataType type) {
        this.type = type;
    }

    public DataType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListDataType)) return false;

        ListDataType that = (ListDataType) o;

        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return type != null ? type.hashCode() : 0;
    }
}
