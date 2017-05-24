package mpei.bkm.model.logic.terms.c;

import mpei.bkm.model.structure.objectspecification.attributeconstraints.AttributeConstraints;
import mpei.bkm.model.structure.objectspecification.concept.BKMClass;

public class WithAttributes extends C {
    private BKMClass bkmClass;

    private AttributeConstraints attributeConstraints;

    public WithAttributes(BKMClass bkmClass, AttributeConstraints attributeConstraints) {
        this.bkmClass = bkmClass;
        this.attributeConstraints = attributeConstraints;
    }

    public BKMClass getBkmClass() {
        return bkmClass;
    }

    public AttributeConstraints getAttributeConstraints() {
        return attributeConstraints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WithAttributes that = (WithAttributes) o;

        if (bkmClass != null ? !bkmClass.equals(that.bkmClass) : that.bkmClass != null) return false;
        return attributeConstraints != null ? attributeConstraints.equals(that.attributeConstraints) : that.attributeConstraints == null;

    }

    @Override
    public int hashCode() {
        int result = bkmClass != null ? bkmClass.hashCode() : 0;
        result = 31 * result + (attributeConstraints != null ? attributeConstraints.hashCode() : 0);
        return result;
    }
}
