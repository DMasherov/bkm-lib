package mpei.bkm.model.lss.objectspecification.attributeconstraints;

import mpei.bkm.model.lss.objectspecification.attributes.ConceptAttribute;

public class ClassAttributeCondition {
    private ConceptAttribute conceptAttribute;
    private AttributeConstraints attributeConstraints;

    public ClassAttributeCondition(ConceptAttribute conceptAttribute, AttributeConstraints attributeConstraints) {
        this.conceptAttribute = conceptAttribute;
        this.attributeConstraints = attributeConstraints;
    }

    public ConceptAttribute getConceptAttribute() {
        return conceptAttribute;
    }

    public AttributeConstraints getAttributeConstraints() {
        return attributeConstraints;
    }
}
