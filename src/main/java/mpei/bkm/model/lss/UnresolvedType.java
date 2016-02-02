package mpei.bkm.model.lss;

/**
 * When parsing text, this class is used to denote a type which can be both concept class and user defined type.
 */
public class UnresolvedType extends Type {
    private String name;

    public UnresolvedType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
