package mpei.bkm.model.logic.terms.p;

import mpei.bkm.utils.identifier.TIdentifierCreator;
import mpei.bkm.model.logic.terms.Term;
import mpei.bkm.utils.identifier.IdentifierCreator;

public abstract class P extends Term {
    private static IdentifierCreator identifier = TIdentifierCreator.getIdentifier();
    protected P() {
        this.id = identifier.getIdentifierCreator();
    }

}
