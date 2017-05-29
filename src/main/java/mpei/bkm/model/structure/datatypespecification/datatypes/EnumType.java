package mpei.bkm.model.structure.datatypespecification.datatypes;

import java.util.ArrayList;
import java.util.List;

public class EnumType extends DataType {
    private List<String> values = new ArrayList<String>();

    public EnumType(List<String> values) {
        this.values = values;
    }

    public List<String> getValues() {
        return values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EnumType)) return false;

        EnumType enumType = (EnumType) o;

        if (values != null ? !values.equals(enumType.values) : enumType.values != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return values != null ? values.hashCode() : 0;
    }
}
