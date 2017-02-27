package mpei.bkm.model.lls1.terms.l;

import mpei.bkm.model.lls1.TIdentifierCreator;
import mpei.bkm.model.lls1.terms.Term;
import mpei.bkm.utils.identifier.IdentifierCreator;

public abstract class L extends Term {
    private static IdentifierCreator idcreator = TIdentifierCreator.getIdentifier();
    protected L() {
        this.id = idcreator.getId();
    }
}
