package mpei.bkm.model.lss.objectspecification.attributeconditions;

import mpei.bkm.model.lss.objectspecification.attributes.ConceptAttribute;

public class ClassAttributeCondition {
    private ConceptAttribute conceptAttribute;
    private BaseAttributeCondition baseAttributeCondition;

    public ClassAttributeCondition(ConceptAttribute conceptAttribute, BaseAttributeCondition baseAttributeCondition) {
        this.conceptAttribute = conceptAttribute;
        this.baseAttributeCondition = baseAttributeCondition;
    }

    public ConceptAttribute getConceptAttribute() {
        return conceptAttribute;
    }

    public BaseAttributeCondition getBaseAttributeCondition() {
        return baseAttributeCondition;
    }
}
