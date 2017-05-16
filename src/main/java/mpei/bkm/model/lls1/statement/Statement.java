package mpei.bkm.model.lls1.statement;

import mpei.bkm.model.lls1.Expression;
import mpei.bkm.model.lls1.TIdentifierCreator;
import mpei.bkm.utils.identifier.IdentifierCreator;

public abstract class Statement extends Expression {
    private static IdentifierCreator idcreator = TIdentifierCreator.getIdentifier();
    protected Statement() {
        this.id = idcreator.getIdentifierCreator();
    }
}