package mpei.bkm.model.lls1;

import mpei.bkm.utils.identifier.IdentifierCreator;
import mpei.bkm.utils.identifier.IdentifierFactory;

public class TIdentifierCreator {
    public static IdentifierCreator getIdentifier() {
        return IdentifierFactory.counter();
    }
    private TIdentifierCreator() {};
}
