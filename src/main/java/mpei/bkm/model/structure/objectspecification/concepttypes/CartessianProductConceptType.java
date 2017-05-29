package mpei.bkm.model.structure.objectspecification.concepttypes;

import java.util.ArrayList;
import java.util.List;

public class CartessianProductConceptType extends ConceptType {
    private List<ConceptType> types = new ArrayList<ConceptType>();

    public CartessianProductConceptType(List<ConceptType> types) {
        this.types = types;
    }

    public List<ConceptType> getTypes() {
        return types;
    }

    public void setTypes(List<ConceptType> types) {
        this.types = types;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CartessianProductConceptType)) return false;

        CartessianProductConceptType that = (CartessianProductConceptType) o;

        if (types != null ? !types.equals(that.types) : that.types != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return types != null ? types.hashCode() : 0;
    }
}