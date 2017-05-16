package mpei.bkm.converters;

import junit.framework.TestCase;
import mpei.bkm.converters.text2ls.Text2LSOntology;
import mpei.bkm.model.lls1.LSOntology;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class Text2LSOntologyTest extends TestCase {
    public void testVisitor() throws Exception {
        String s = FileUtils.readFileToString(new File(ClassLoader.getSystemResource("steamroller.ls").getFile()));

        Text2LSOntology converter = new Text2LSOntology();

        LSOntology o = converter.convert(s);

        TestCase.assertNotNull(o);
        TestCase.assertTrue(o.getStatements().size() == 20);
    }
}
