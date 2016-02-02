package mpei.bkm.model.lss.objectspecification.attributes;

import mpei.bkm.model.lss.Attribute;
import mpei.bkm.model.lss.datatypespecification.datatypes.DataType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class DataTypeAttribute extends Attribute<DataType> {

    public DataTypeAttribute(String name, DataType type) {
        super(name, type);
    }

    @Override
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
