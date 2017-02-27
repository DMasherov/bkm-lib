package mpei.bkmapi.converters.lls1ontology2text;

import junit.framework.TestCase;
import mpei.bkm.converters.lls12text.SimpleExpressionOntology2Text;
import mpei.bkm.converters.text2lls1.Text2SimpleExpressionOntology;
import mpei.bkm.model.lls1.SimpleExpressionOntology;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class SimpleOntolology2Text extends TestCase {
    public void testParseThenSerializeSimple() throws Exception {
        String s = FileUtils.readFileToString(new File(ClassLoader.getSystemResource("steamroller.lls1").getFile()));

        Text2SimpleExpressionOntology fromFile = new Text2SimpleExpressionOntology();

        SimpleExpressionOntology o = fromFile.convert(s);

        SimpleExpressionOntology2Text toText = new SimpleExpressionOntology2Text();
        String simpleExprText = toText.convert(o);

        assertNotNull(simpleExprText);
    }
}
