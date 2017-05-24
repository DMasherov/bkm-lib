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
}
