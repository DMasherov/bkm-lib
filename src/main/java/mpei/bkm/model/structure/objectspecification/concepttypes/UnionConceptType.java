package mpei.bkm.model.structure.objectspecification.concepttypes;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UnionConceptType)) return false;

        UnionConceptType that = (UnionConceptType) o;

        if (left != null ? !left.equals(that.left) : that.left != null) return false;
        if (right != null ? !right.equals(that.right) : that.right != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = left != null ? left.hashCode() : 0;
        result = 31 * result + (right != null ? right.hashCode() : 0);
        return result;
    }
}
