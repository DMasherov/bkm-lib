package mpei.bkm.model.logic.terms.l;

import mpei.bkm.model.structure.objectspecification.attributeconstraints.AttributeConstraints;
import mpei.bkm.model.structure.objectspecification.concept.BinaryLink;

public class WithAttributes extends L {
    private BinaryLink binaryLink;

    private AttributeConstraints attributeConstraints;

    public WithAttributes(BinaryLink binaryLink, AttributeConstraints attributeConstraints) {
        this.binaryLink = binaryLink;
        this.attributeConstraints = attributeConstraints;
    }
    public BinaryLink getBinaryLink() {
        return binaryLink;
    }

    public AttributeConstraints getAttributeConstraints() {
        return attributeConstraints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WithAttributes that = (WithAttributes) o;

        if (binaryLink != null ? !binaryLink.equals(that.binaryLink) : that.binaryLink != null) return false;
        return attributeConstraints != null ? attributeConstraints.equals(that.attributeConstraints) : that.attributeConstraints == null;

    }

    @Override
    public int hashCode() {
        int result = binaryLink != null ? binaryLink.hashCode() : 0;
        result = 31 * result + (attributeConstraints != null ? attributeConstraints.hashCode() : 0);
        return result;
    }
}
