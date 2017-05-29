package mpei.bkm.model.structure.objectspecification.concepttypes;

public class StarConceptType extends ConceptType {
    private ConceptType type;

    public StarConceptType(ConceptType type) {
        this.type = type;
    }

    public ConceptType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StarConceptType)) return false;

        StarConceptType that = (StarConceptType) o;

        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return type != null ? type.hashCode() : 0;
    }
}
