package mpei.bkm.model.lls1.terms.c;

import mpei.bkm.model.lls1.TIdentifierCreator;
import mpei.bkm.model.lls1.terms.Term;
import mpei.bkm.utils.identifier.IdentifierCreator;

public abstract class C  extends Term {
    private static IdentifierCreator idcreator = TIdentifierCreator.getIdentifier();
    protected C() {
        this.id = idcreator.getIdentifierCreator();
    }
}
