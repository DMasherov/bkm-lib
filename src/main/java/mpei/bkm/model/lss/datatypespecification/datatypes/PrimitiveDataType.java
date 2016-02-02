package mpei.bkm.model.lss.datatypespecification.datatypes;

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
}
