package mpei.bkm.converters.scheme2text;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.lss.objectspecification.attributes.ConceptAttribute;

public class ConceptAttribute2TextConverter implements Converter<ConceptAttribute,String> {
    @Override
    public String convert(ConceptAttribute conceptAttribute) throws UnconvertableException {
        if (conceptAttribute == null) {
            return "";
        }
        ConceptType2TextConverter conceptType2TextConverter = new ConceptType2TextConverter();
        String typeString = conceptType2TextConverter.convert(conceptAttribute.getType());
        if (conceptAttribute.getName().equals(typeString))
            return conceptAttribute.getName();
        return conceptAttribute.getName() + ":" + conceptType2TextConverter.convert(conceptAttribute.getType());
    }
}