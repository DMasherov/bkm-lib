package mpei.bkm.model.structure.datatypespecification.datatypes;

public class LabeledDataType extends DataType {
    private String label;
    private DataType type;

    public LabeledDataType(String label, DataType type) {
        this.label = label;
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public DataType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LabeledDataType)) return false;

        LabeledDataType that = (LabeledDataType) o;

        if (label != null ? !label.equals(that.label) : that.label != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = label != null ? label.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
