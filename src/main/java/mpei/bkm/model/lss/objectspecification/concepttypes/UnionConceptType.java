package mpei.bkm.model.lss.objectspecification.concepttypes;

public class UnionConceptType extends ConceptType {
    private ConceptType left;
    private ConceptType right;

    public UnionConceptType(ConceptType left, ConceptType right) {
        this.left = left;
        this.right = right;
    }

    public ConceptType getLeft() {
        return left;
    }

    public ConceptType getRight() {
        return right;
    }
}
