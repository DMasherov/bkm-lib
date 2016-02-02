package mpei.bkm.model.lss.datatypespecification.datatypes;

import java.util.ArrayList;
import java.util.List;

public class CartessianProductDataType extends DataType {
    private List<DataType> types = new ArrayList<DataType>();

    public CartessianProductDataType(List<DataType> types) {
        this.types = types;
    }

    public List<DataType> getTypes() {
        return types;
    }

    public void setTypes(List<DataType> types) {
        this.types = types;
    }
}