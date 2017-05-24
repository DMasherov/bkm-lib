package mpei.bkm.model.logic.terms.c;

import mpei.bkm.utils.identifier.TIdentifierCreator;
import mpei.bkm.model.logic.terms.Term;
import mpei.bkm.utils.identifier.IdentifierCreator;

public abstract class C  extends Term {
    private static IdentifierCreator idcreator = TIdentifierCreator.getIdentifier();
    protected C() {
        this.id = idcreator.getIdentifierCreator();
    }
}
