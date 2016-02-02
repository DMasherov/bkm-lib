package mpei.bkm.parsing.structurescheme.parsers.schemeparseinfo;

import mpei.bkm.model.lss.objectspecification.attributes.ConceptAttribute;
import mpei.bkm.model.lss.objectspecification.concepttypes.ConceptType;

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
