package mpei.bkm.utils.identifier;

public class Constant<T> implements IdentifierCreator<T> {

    private T t;
    public Constant(T t) {
        this.t = t;
    }

    public Identifier<T> getIdentifierCreator() {
        return new Identifier<T>(t);
    }
}
