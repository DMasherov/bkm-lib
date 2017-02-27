package mpei.bkm.model.lls1.terms.p;

import mpei.bkm.model.lls1.Expression;
import mpei.bkm.model.lls1.TIdentifierCreator;
import mpei.bkm.model.lls1.terms.Term;
import mpei.bkm.utils.identifier.IdentifierCreator;

public abstract class P extends Term {
    private static IdentifierCreator identifier = TIdentifierCreator.getIdentifier();
    protected P() {
        this.id = identifier.getId();
    }

}
