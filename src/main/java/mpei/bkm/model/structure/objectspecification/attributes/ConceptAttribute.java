package mpei.bkm.model.structure.objectspecification.attributes;

import mpei.bkm.model.structure.Attribute;
import mpei.bkm.model.structure.objectspecification.concepttypes.ConceptType;

public class ConceptAttribute extends Attribute<ConceptType> {
    public ConceptAttribute(String name, ConceptType type) {
        super(name, type);
    }
}