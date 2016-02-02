package mpei.bkm.converters.scheme2text;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.lss.objectspecification.attributeconditions.ClassAttributeCondition;

public class ClassAttributeCondition2TextConverter implements Converter<ClassAttributeCondition,String> {
    @Override
    public String convert(ClassAttributeCondition classAttributeCondition) throws UnconvertableException {
        ConceptAttribute2TextConverter conceptAttribute2TextConverter = new ConceptAttribute2TextConverter();
        BaseAttributeCondition2TextConverter baseAttributeCondition2TextConverter = new BaseAttributeCondition2TextConverter();
        return conceptAttribute2TextConverter.convert(classAttributeCondition.getConceptAttribute()) +
                baseAttributeCondition2TextConverter.convert(classAttributeCondition.getBaseAttributeCondition());
    }
}