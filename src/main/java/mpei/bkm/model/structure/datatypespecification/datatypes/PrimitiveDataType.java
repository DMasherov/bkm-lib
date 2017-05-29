package mpei.bkm.model.structure.datatypespecification.datatypes;

public class PrimitiveDataType extends DataType {
    public static enum PRIMITIVEDATATYPE {
        Boolean, Number, Integer, Char, String
    }

    private PRIMITIVEDATATYPE type;

    public PrimitiveDataType(PRIMITIVEDATATYPE type) {
        this.type = type;
    }

    public PRIMITIVEDATATYPE getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PrimitiveDataType)) return false;

        PrimitiveDataType that = (PrimitiveDataType) o;

        if (type != that.type) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return type != null ? type.hashCode() : 0;
    }
}
