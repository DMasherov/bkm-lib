package mpei.bkm.utils.identifier;

public class Identifier<T> {
    private T id;

    public Identifier(T id) {
        this.id = id;
    }

    public Object getId() {
        return id;
    }

    public String toString() {
        return id.toString();
    }
}
