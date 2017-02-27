package mpei.bkmapi.converters;

import junit.framework.TestCase;
import mpei.bkm.converters.text2lls1.Text2SimpleExpressionOntology;
import mpei.bkm.model.lls1.Ontology;
import mpei.bkm.model.lls1.statement.ExistC;
import mpei.bkm.model.lls1.statement.IsaC;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class Text2LLS1OntologyTest extends TestCase {
    public void testVisitor() throws Exception {
        String s = FileUtils.readFileToString(new File(ClassLoader.getSystemResource("steamroller.lls1").getFile()));

        Text2SimpleExpressionOntology converter = new Text2SimpleExpressionOntology();

        Ontology o = converter.convert(s);

        TestCase.assertNotNull(o);
        TestCase.assertTrue(o.getStatements().size() == 20);
        TestCase.assertTrue(o.getStatements().get(0) instanceof IsaC);
        TestCase.assertTrue(o.getStatements().get(19) instanceof ExistC);
    }
}
