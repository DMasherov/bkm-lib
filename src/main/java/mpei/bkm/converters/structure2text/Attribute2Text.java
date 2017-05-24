package mpei.bkm.converters.structure2text;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.structure.Attribute;
import mpei.bkm.model.structure.objectspecification.attributes.ConceptAttribute;
import mpei.bkm.model.structure.objectspecification.attributes.DataTypeAttribute;

public class Attribute2Text implements Converter<Attribute,String> {
    @Override
    public String convert(Attribute attribute) throws UnconvertableException {
        if (attribute == null) {
            return "";
        }
        if (attribute instanceof ConceptAttribute) {
            ConceptAttribute2Text conceptAttribute2TextConverter = new ConceptAttribute2Text();
            return conceptAttribute2TextConverter.convert((ConceptAttribute) attribute);
        }
        if (attribute instanceof DataTypeAttribute) {
            DataTypeAttribute2Text dataTypeAttributee2TextConverter = new DataTypeAttribute2Text();
            return dataTypeAttributee2TextConverter.convert((DataTypeAttribute) attribute);
        }
        throw new UnconvertableException("Unknown attribute kind");
    }
}