package mpei.bkm.model.lss.objectspecification.concepttypes;

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
}