package mpei.bkm.converters.scheme2text;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.lss.objectspecification.attributes.DataTypeAttribute;

public class DataTypeAttribute2Text implements Converter<DataTypeAttribute,String> {
    @Override
    public String convert(DataTypeAttribute dataTypeAttribute) throws UnconvertableException {
        DataType2Text dataType2TextConverter = new DataType2Text();
        return dataTypeAttribute.getName() + ":" + dataType2TextConverter.convert(dataTypeAttribute.getType());
    }
}