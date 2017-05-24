package mpei.bkm.converters.ls2text;

import mpei.bkm.converters.text2ls.Text2LSOntology;
import mpei.bkm.model.lls1.LSOntology;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class SimpleOntolology2Text  {
    @Test
    public void testParseThenSerializeSimple() throws Exception {
        String s = FileUtils.readFileToString(new File(ClassLoader.getSystemResource("steamroller.ls").getFile()));

        Text2LSOntology fromFile = new Text2LSOntology();

        LSOntology o = fromFile.convert(s);

        LSOntology2Text toText = new LSOntology2Text();
        String simpleExprText = toText.convert(o);

        Assert.assertNotNull(simpleExprText);
    }
}
