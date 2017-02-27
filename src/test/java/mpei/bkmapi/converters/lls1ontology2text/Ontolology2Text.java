package mpei.bkmapi.converters.lls1ontology2text;

import junit.framework.TestCase;
import mpei.bkm.converters.lls12text.Ontology2Text;
import mpei.bkm.converters.text2lls1.Text2SimpleExpressionOntology;
import mpei.bkm.model.lls1.Ontology;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class Ontolology2Text extends TestCase {
    public void testParseThenSerializeSimple() throws Exception {
        String s = FileUtils.readFileToString(new File(ClassLoader.getSystemResource("steamroller.lls1").getFile()));

        Text2SimpleExpressionOntology fromFile = new Text2SimpleExpressionOntology();

        Ontology o = fromFile.convert(s);

        Ontology2Text toText = new Ontology2Text();
        String ontText = toText.convert(o);

        assertNotNull(ontText);
    }
}
