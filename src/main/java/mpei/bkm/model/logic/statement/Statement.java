package mpei.bkm.model.logic.statement;

import mpei.bkm.model.commonfeatures.Expression;
import mpei.bkm.utils.identifier.TIdentifierCreator;
import mpei.bkm.utils.identifier.IdentifierCreator;

public abstract class Statement extends Expression {
    private static IdentifierCreator idcreator = TIdentifierCreator.getIdentifier();
    protected Statement() {
        this.id = idcreator.getIdentifierCreator();
    }
}