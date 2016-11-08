package mpei.bkm.model.lss.datatypespecification;

import mpei.bkm.model.lss.datatypespecification.datatypes.DataType;

public class DefinedType  {
    private String name;
    private DataType dataType;

    public DefinedType(String name, DataType dataType) {
        this.name = name;
        this.dataType = dataType;
    }

    public String getName() {
        return name;
    }

    public DataType getDataType() {
        return dataType;
    }
}