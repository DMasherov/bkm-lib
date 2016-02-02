package mpei.bkm.model.lss.datatypespecification.datatypes;

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
}
