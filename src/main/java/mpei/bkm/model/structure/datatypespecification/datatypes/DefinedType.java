package mpei.bkm.model.structure.datatypespecification.datatypes;

public class DefinedType extends DataType {
    private String name;
    private DataType type;

    public DefinedType(String name) {
        this.name = name;
    }
    public DefinedType(String name, DataType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public DataType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DefinedType)) return false;

        DefinedType that = (DefinedType) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
