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
}
