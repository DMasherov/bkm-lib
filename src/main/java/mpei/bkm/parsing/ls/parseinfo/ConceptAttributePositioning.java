package mpei.bkm.parsing.ls.parseinfo;

import mpei.bkm.model.structure.objectspecification.attributes.ConceptAttribute;
import mpei.bkm.model.structure.objectspecification.concepttypes.ConceptType;

/**
 * Helper class for memorizing position of concept attributes.
 */
public class ConceptAttributePositioning extends ConceptAttribute {
    private Positioning positioning;

    public ConceptAttributePositioning(String name, ConceptType concept, Positioning positioning) {
        super(name, concept);
        this.positioning = positioning;
    }

    /**
     * Gets position of attribute in text.
     * @return Position.
     */
    public Positioning getPositioning() {
        return positioning;
    }
}
