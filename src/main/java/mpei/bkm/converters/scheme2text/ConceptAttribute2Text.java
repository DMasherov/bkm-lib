package mpei.bkm.converters.scheme2text;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.structure.objectspecification.attributes.ConceptAttribute;

public class ConceptAttribute2Text implements Converter<ConceptAttribute,String> {
    @Override
    public String convert(ConceptAttribute conceptAttribute) throws UnconvertableException {
        if (conceptAttribute == null) {
            return "";
        }
        ConceptType2Text conceptType2TextConverter = new ConceptType2Text();
        String typeString = conceptType2TextConverter.convert(conceptAttribute.getType());
        if (conceptAttribute.getName().equals(typeString))
            return conceptAttribute.getName();
        return conceptAttribute.getName() + ":" + conceptType2TextConverter.convert(conceptAttribute.getType());
    }
}