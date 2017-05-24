package mpei.bkm.converters.structure2text;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.structure.objectspecification.attributeconstraints.ClassAttributeCondition;

public class ClassAttributeCondition2Text implements Converter<ClassAttributeCondition,String> {
    @Override
    public String convert(ClassAttributeCondition classAttributeCondition) throws UnconvertableException {
        ConceptAttribute2Text conceptAttribute2TextConverter = new ConceptAttribute2Text();
        BaseAttributeCondition2Text baseAttributeCondition2TextTextConverter = new BaseAttributeCondition2Text();
        return conceptAttribute2TextConverter.convert(classAttributeCondition.getConceptAttribute()) +
                baseAttributeCondition2TextTextConverter.convert(classAttributeCondition.getAttributeConstraints());
    }
}