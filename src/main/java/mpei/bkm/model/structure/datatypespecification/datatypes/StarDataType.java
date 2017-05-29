package mpei.bkm.model.structure.datatypespecification.datatypes;

public class StarDataType extends DataType {
    private DataType type;

    public StarDataType(DataType type) {
        this.type = type;
    }

    public DataType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StarDataType)) return false;

        StarDataType that = (StarDataType) o;

        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return type != null ? type.hashCode() : 0;
    }
}
