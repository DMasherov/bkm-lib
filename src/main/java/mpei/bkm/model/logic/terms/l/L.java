package mpei.bkm.model.logic.terms.l;

import mpei.bkm.utils.identifier.TIdentifierCreator;
import mpei.bkm.model.logic.terms.Term;
import mpei.bkm.utils.identifier.IdentifierCreator;

public abstract class L extends Term {
    private static IdentifierCreator idcreator = TIdentifierCreator.getIdentifier();
    protected L() {
        this.id = idcreator.getIdentifierCreator();
    }
}
