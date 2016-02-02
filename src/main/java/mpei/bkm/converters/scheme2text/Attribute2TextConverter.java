package mpei.bkm.converters.scheme2text;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.lss.Attribute;
import mpei.bkm.model.lss.objectspecification.attributes.ConceptAttribute;
import mpei.bkm.model.lss.objectspecification.attributes.DataTypeAttribute;

public class Attribute2TextConverter implements Converter<Attribute,String> {
    @Override
    public String convert(Attribute attribute) throws UnconvertableException {
        if (attribute == null) {
            return "";
        }
        if (attribute instanceof ConceptAttribute) {
            ConceptAttribute2TextConverter conceptAttribute2TextConverter = new ConceptAttribute2TextConverter();
            return conceptAttribute2TextConverter.convert((ConceptAttribute) attribute);
        }
        if (attribute instanceof DataTypeAttribute) {
            DataTypeAttribute2TextConverter dataTypeAttributee2TextConverter = new DataTypeAttribute2TextConverter();
            return dataTypeAttributee2TextConverter.convert((DataTypeAttribute) attribute);
        }
        throw new UnconvertableException("Unknown attribute kind");
    }
}