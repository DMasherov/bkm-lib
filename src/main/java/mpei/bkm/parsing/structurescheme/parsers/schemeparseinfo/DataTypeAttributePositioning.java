package mpei.bkm.parsing.structurescheme.parsers.schemeparseinfo;

import mpei.bkm.model.lss.objectspecification.attributes.DataTypeAttribute;
import mpei.bkm.model.lss.datatypespecification.datatypes.DataType;

/**
 * Helper class for memorizing position of data type attributes.
 */
public class DataTypeAttributePositioning extends DataTypeAttribute {
    private Positioning positioning;

    public DataTypeAttributePositioning(String name, DataType type, Positioning positioning) {
        super(name, type);
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
