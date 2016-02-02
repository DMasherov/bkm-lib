package mpei.bkm.converters.scheme2sql;

import mpei.bkm.converters.text2scheme.Text2SchemeContainerConverter;
import mpei.bkm.parsing.structurescheme.SchemeContainer;
import mpei.bkm.converters.scheme2text.Scheme2TextConverter;
import junit.framework.TestCase;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class Scheme2SqlConverterTest extends TestCase {
    public void testEquals() throws Exception {
        String fileContent = FileUtils.readFileToString(new File(ClassLoader.getSystemResource("src/test/resources/Student1.ss").getFile()));

        Text2SchemeContainerConverter text2SchemeContainerConverter = new Text2SchemeContainerConverter();
        Scheme2TextConverter scheme2TextConverter = new Scheme2TextConverter();

        SchemeContainer schemeContainer = text2SchemeContainerConverter.convert(fileContent);

        Scheme2SqlConverter converter = new Scheme2SqlConverter();
        String script = converter.convert(schemeContainer);
        String expected = script;
        TestCase.assertEquals(expected, script);
    }
}