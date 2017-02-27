package mpei.bkm.utils.identifier;

import java.util.UUID;

/**
 * Created by dmasherov on 2/23/17.
 */
public class IdentifierFactory {
    public static IdentifierCreator<Integer> counter() {
        return new Counter();
    }
    public static IdentifierCreator<UUID> uuid() {
        return new UUIDCreator();
    }
    public static <T> IdentifierCreator constant(T t) {
        return new Constant<T>(t);
    }
    private IdentifierFactory() {}
}
