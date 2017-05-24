package mpei.bkm.converters.text2ls;

import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.converters.text2scheme.Text2SchemeContainer;
import mpei.bkm.model.structure.datatypespecification.datatypes.PrimitiveDataType;
import mpei.bkm.model.structure.objectspecification.attributes.ConceptAttribute;
import mpei.bkm.model.structure.objectspecification.concept.BKMClass;
import mpei.bkm.model.structure.objectspecification.concepttypes.BKMClassType;
import mpei.bkm.model.structure.objectspecification.concepttypes.ConceptType;
import mpei.bkm.model.structure.objectspecification.concepttypes.StarConceptType;
import mpei.bkm.model.structure.objectspecification.concepttypes.UnionConceptType;
import mpei.bkm.parsing.structurescheme.SchemeContainer;
import mpei.bkm.converters.scheme2text.Scheme2Text;
import org.junit.Assert;
import org.junit.Test;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class Text2SchemeContainerTest {
    @Test
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

        Assert.assertEquals(type1, type2);
        Assert.assertEquals(type3, type4);
        Assert.assertNotSame(type4, type5);
        Assert.assertNotSame(type4, type6);
        Assert.assertEquals(attribute1, attribute2);
        Assert.assertNotSame(attribute1, attribute3);
        Assert.assertNotSame(attribute1, attribute4);
    }
    private String convertToSchemeContainerAndBack(String schemeString) throws UnconvertableException {
        Text2SchemeContainer text2SchemeContainerConverter = new Text2SchemeContainer();
        Scheme2Text scheme2TextConverter= new Scheme2Text();

        SchemeContainer schemeContainer = text2SchemeContainerConverter.convert(schemeString);
        for (String s : text2SchemeContainerConverter.getIncompleteness()) {
            System.out.println(s);
        }
        return scheme2TextConverter.convert(schemeContainer.getScheme());
    }

    @Test
    public void testConvertSimple2Text() throws Exception {
        String fileContent = FileUtils.readFileToString(new File(ClassLoader.getSystemResource("Simple.ss").getFile()));
        String converted = convertToSchemeContainerAndBack(fileContent);
        Assert.assertEquals(fileContent.replaceAll("[ \\t\\r\\n]", ""), converted.replaceAll("[ \\t\\r\\n]", ""));
    }

    @Test
    public void testConvertStudent2Text() throws Exception {
        String fileContent = FileUtils.readFileToString(new File(ClassLoader.getSystemResource("src/test/resources/Student.structure").getFile()));
        String converted = convertToSchemeContainerAndBack(fileContent);
        Assert.assertEquals(fileContent.replaceAll("[ \\t\\r\\n]", ""), converted.replaceAll("[ \\t\\r\\n]", ""));
    }

    @Test
    public void testConvertRS_PLUS_S2Text() throws Exception {
        String fileContent = FileUtils.readFileToString(new File(ClassLoader.getSystemResource("RS+S.ss").getFile()));
        String converted = convertToSchemeContainerAndBack(fileContent);
        Assert.assertEquals(fileContent.replaceAll("[ \\t\\r\\n]", ""), converted.replaceAll("[ \\t\\r\\n]", ""));
    }
}