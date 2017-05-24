package mpei.bkm.model.structure.objectspecification.attributeconstraints;

import mpei.bkm.model.structure.objectspecification.attributes.ConceptAttribute;

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
