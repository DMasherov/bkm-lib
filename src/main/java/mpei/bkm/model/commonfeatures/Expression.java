package mpei.bkm.model.commonfeatures;

import mpei.bkm.utils.identifier.Identifier;

/**
 * Base case for statements and c-,p-,l-terms.
 */
public abstract class Expression {
    protected Identifier id;

    protected Expression parent;

    public Expression getParent() {
        return parent;
    }

    public void setParent(Expression parent) {
        this.parent = parent;
    }

    public Identifier getId() {
        return id;
    }
}
