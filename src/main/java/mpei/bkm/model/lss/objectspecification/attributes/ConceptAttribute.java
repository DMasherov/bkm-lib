package mpei.bkm.model.lss.objectspecification.attributes;

import mpei.bkm.model.lss.Attribute;
import mpei.bkm.model.lss.objectspecification.concepttypes.ConceptType;

public class ConceptAttribute extends Attribute<ConceptType> {
    public ConceptAttribute(String name, ConceptType type) {
        super(name, type);
    }
}