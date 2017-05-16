package mpei.bkm.converters;

import mpei.bkm.converters.text2scheme.Text2SchemeContainerConverter;
import mpei.bkm.model.lss.datatypespecification.datatypes.PrimitiveDataType;
import mpei.bkm.model.lss.objectspecification.attributes.ConceptAttribute;
import mpei.bkm.model.lss.objectspecification.concept.BKMClass;
import mpei.bkm.model.lss.objectspecification.concepttypes.BKMClassType;
import mpei.bkm.model.lss.objectspecification.concepttypes.ConceptType;
import mpei.bkm.model.lss.objectspecification.concepttypes.StarConceptType;
import mpei.bkm.model.lss.objectspecification.concepttypes.UnionConceptType;
import mpei.bkm.parsing.structurescheme.SchemeContainer;
import mpei.bkm.converters.scheme2text.Scheme2TextConverter;
import junit.framework.TestCase;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class Text2SchemeContainerConverterTest extends TestCase {
    public void testEquals() throws Exception {
        PrimitiveDataType type1 = new PrimitiveDataType(PrimitiveDataType.PRIMITIVEDATATYPE.Integer);
        PrimitiveDataType type2 = new PrimitiveDataType(PrimitiveDataType.PRIMITIVEDATATYPE.Integer);

        ConceptType type3 = new StarConceptType(new BKMClassType(new BKMClass("CLASS")));
        ConceptType type4 = new StarConceptType(new BKMClassType(new BKMClass("CLASS")));
        ConceptType type5 = new StarConceptType(new BKMClassType(new BKMClass("CLASS",new BKMClass("ISACLASS"))));
        ConceptType type6 = new UnionConceptType(new BKMClassType(new BKMClass("CLASS")),new BKMClassType(new BKMClass("CLASS")));


        ConceptAttribute attribute1 = new ConceptAttribute("ATTR",type5);
        ConceptAttribute attribute2 = new ConceptAttribute("ATTR",type5);
        ConceptAttribute attribute3 = new ConceptAttribute("ATTR",type6);
        ConceptAttribute attribute4 = new ConceptAttribute("DIFFERENTNAME_ATTR",type5);

        TestCase.assertEquals(type1, type2);
        TestCase.assertEquals(type3, type4);
        TestCase.assertNotSame(type4, type5);
        TestCase.assertNotSame(type4, type6);
        TestCase.assertEquals(attribute1, attribute2);
        TestCase.assertNotSame(attribute1, attribute3);
        TestCase.assertNotSame(attribute1, attribute4);
    }
    private String convertToSchemeContainerAndBack(String schemeString) throws UnconvertableException {
        Text2SchemeContainerConverter text2SchemeContainerConverter = new Text2SchemeContainerConverter();
        Scheme2TextConverter scheme2TextConverter= new Scheme2TextConverter();

        SchemeContainer schemeContainer = text2SchemeContainerConverter.convert(schemeString);
        for (String s : text2SchemeContainerConverter.getIncompleteness()) {
            System.out.println(s);
        }
        return scheme2TextConverter.convert(schemeContainer.getScheme());
    }
    public void testConvertSimple2Text() throws Exception {
        String fileContent = FileUtils.readFileToString(new File(ClassLoader.getSystemResource("Simple.ss").getFile()));
        String converted = convertToSchemeContainerAndBack(fileContent);
        TestCase.assertEquals(fileContent.replaceAll("[ \\t\\r\\n]", ""), converted.replaceAll("[ \\t\\r\\n]", ""));
    }
    public void testConvertStudent2Text() throws Exception {
        String fileContent = FileUtils.readFileToString(new File(ClassLoader.getSystemResource("src/test/resources/Student.ss").getFile()));
        String converted = convertToSchemeContainerAndBack(fileContent);
        TestCase.assertEquals(fileContent.replaceAll("[ \\t\\r\\n]", ""), converted.replaceAll("[ \\t\\r\\n]", ""));
    }
    public void testConvertRS_PLUS_S2Text() throws Exception {
        String fileContent = FileUtils.readFileToString(new File(ClassLoader.getSystemResource("RS+S.ss").getFile()));
        String converted = convertToSchemeContainerAndBack(fileContent);
        TestCase.assertEquals(fileContent.replaceAll("[ \\t\\r\\n]", ""), converted.replaceAll("[ \\t\\r\\n]", ""));
    }
}