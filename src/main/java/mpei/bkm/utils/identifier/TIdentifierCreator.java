package mpei.bkm.utils.identifier;

import mpei.bkm.utils.identifier.IdentifierCreator;
import mpei.bkm.utils.identifier.IdentifierFactory;

public class TIdentifierCreator {
    public static IdentifierCreator getIdentifier() {
        return IdentifierFactory.counter();
    }
    private TIdentifierCreator() {};
}
