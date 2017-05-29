package mpei.bkm.model.structure.datatypespecification.datatypes;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CartessianProductDataType)) return false;

        CartessianProductDataType that = (CartessianProductDataType) o;

        if (types != null ? !types.equals(that.types) : that.types != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return types != null ? types.hashCode() : 0;
    }
}