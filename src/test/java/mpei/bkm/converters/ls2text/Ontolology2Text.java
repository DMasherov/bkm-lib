package mpei.bkm.converters.ls2text;

import junit.framework.TestCase;
import mpei.bkm.converters.ls2text.Ontology2Text;
import mpei.bkm.converters.text2ls.Text2LSOntology;
import mpei.bkm.model.lls1.LSOntology;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class Ontolology2Text extends TestCase {
    public void testParseThenSerializeSimple() throws Exception {
        String s = FileUtils.readFileToString(new File(ClassLoader.getSystemResource("steamroller.ls").getFile()));

        Text2LSOntology fromFile = new Text2LSOntology();

        LSOntology o = fromFile.convert(s);

        Ontology2Text toText = new Ontology2Text();
        String ontText = toText.convert(o);

        assertNotNull(ontText);
    }
}
