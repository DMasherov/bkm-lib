package mpei.bkm.converters.scheme2text;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.lss.objectspecification.attributes.DataTypeAttribute;

public class DataTypeAttribute2TextConverter implements Converter<DataTypeAttribute,String> {
    @Override
    public String convert(DataTypeAttribute dataTypeAttribute) throws UnconvertableException {
        DataType2TextConverter dataType2TextConverter = new DataType2TextConverter();
        return dataTypeAttribute.getName() + ":" + dataType2TextConverter.convert(dataTypeAttribute.getType());
    }
}