package mpei.bkm.model.lss.objectspecification.attributeconstraints;

import java.util.ArrayList;
import java.util.List;

public class AttributeConstraints {
    private List<ElementaryAttributeConstraint> elementaryAttributeConstraint = new ArrayList<ElementaryAttributeConstraint>();

    public AttributeConstraints(List<ElementaryAttributeConstraint> elementaryAttributeConstraint) {
        this.elementaryAttributeConstraint = elementaryAttributeConstraint;
    }

    public List<ElementaryAttributeConstraint> getElementaryAttributeConstraint() {
        return elementaryAttributeConstraint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AttributeConstraints that = (AttributeConstraints) o;

        return elementaryAttributeConstraint != null ? elementaryAttributeConstraint.equals(that.elementaryAttributeConstraint) : that.elementaryAttributeConstraint == null;

    }

    @Override
    public int hashCode() {
        return elementaryAttributeConstraint != null ? elementaryAttributeConstraint.hashCode() : 0;
    }
}
