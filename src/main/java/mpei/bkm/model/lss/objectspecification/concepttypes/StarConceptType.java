package mpei.bkm.model.lss.objectspecification.concepttypes;

public class StarConceptType extends ConceptType {
    private ConceptType type;

    public StarConceptType(ConceptType type) {
        this.type = type;
    }

    public ConceptType getType() {
        return type;
    }
}
