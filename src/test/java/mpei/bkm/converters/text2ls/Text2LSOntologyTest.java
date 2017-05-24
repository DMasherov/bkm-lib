package mpei.bkm.converters.text2ls;

import junit.framework.TestCase;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.lls1.LSOntology;
import mpei.bkm.model.lls1.terms.c.WithAttributes;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class Text2LSOntologyTest {

    @Test
    public void testReadOnlyLogicalSentences() throws Exception {
        LSOntology o = loadOntology("steamroller.ls");
        TestCase.assertNotNull(o);
        TestCase.assertEquals(o.getStatements().size(), 20);
    }

    @Test
    public void testReadOnlyDeclarations() throws Exception {
        LSOntology o = loadOntology("Student.ss");
        TestCase.assertNotNull(o);
        TestCase.assertEquals(o.getStatements().size(), 0);
        TestCase.assertEquals(o.getClasses().size(), 5);
        TestCase.assertEquals(o.getBinaryLinks().size(), 7);
    }

    @Test
    public void testReadFullOntology() throws Exception {
        LSOntology o = loadOntology("robots.ls");
        TestCase.assertNotNull(o);
        TestCase.assertEquals(o.getClassesTerms().size(), 8);
        TestCase.assertEquals(o.getBinaryLinksTerms().size(), 1);
        TestCase.assertEquals(o.getStatements().size(), 12);
    }

    protected LSOntology loadOntology(String fileName) throws UnconvertableException, IOException {
        String s = FileUtils.readFileToString(
                new File(ClassLoader.getSystemResource(fileName).getFile())
        );
        Text2LSOntology converter = new Text2LSOntology();

        return converter.convert(s);

    }
}
