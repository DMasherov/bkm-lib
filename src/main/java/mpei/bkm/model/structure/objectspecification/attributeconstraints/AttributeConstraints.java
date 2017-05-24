package mpei.bkm.model.structure.objectspecification.attributeconstraints;

import java.util.ArrayList;
import java.util.List;

public class AttributeConstraints {
    private List<Constraint> constraints = new ArrayList<>();

    public AttributeConstraints(List<Constraint> constraints) {
        this.constraints = constraints;
    }

    public List<Constraint> getConstraints() {
        return constraints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AttributeConstraints that = (AttributeConstraints) o;

        return constraints != null ? constraints.equals(that.constraints) : that.constraints == null;

    }

    @Override
    public int hashCode() {
        return constraints != null ? constraints.hashCode() : 0;
    }
}
