package mpei.bkm.model.lss.objectspecification.attributes;

import mpei.bkm.model.lss.Attribute;
import mpei.bkm.model.lss.datatypespecification.datatypes.DataType;

public class DataTypeAttribute extends Attribute<DataType> {

    public DataTypeAttribute(String name, DataType type) {
        super(name, type);
    }
}
