package mpei.bkm.converters.ls2text;

import mpei.bkm.converters.text2ls.Text2LSOntology;
import mpei.bkm.model.lls1.LSOntology;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;

import java.io.File;

public class Ontolology2Text  {
    public void testParseThenSerializeSimple() throws Exception {
        String s = FileUtils.readFileToString(new File(ClassLoader.getSystemResource("steamroller.ls").getFile()));

        Text2LSOntology fromFile = new Text2LSOntology();

        LSOntology o = fromFile.convert(s);

        Ontology2Text toText = new Ontology2Text();
        String ontText = toText.convert(o);

        Assert.assertNotNull(ontText);
    }
}
