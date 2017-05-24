package mpei.bkm.model.structure.objectspecification.attributes;

import mpei.bkm.model.structure.Attribute;
import mpei.bkm.model.structure.datatypespecification.datatypes.DataType;

public class DataTypeAttribute extends Attribute<DataType> {

    public DataTypeAttribute(String name, DataType type) {
        super(name, type);
    }
}
