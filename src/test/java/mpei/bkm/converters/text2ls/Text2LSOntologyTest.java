package mpei.bkm.converters.text2ls;

import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.logic.LSOntology;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class Text2LSOntologyTest {

    @Test
    public void testReadOnlyLogicalSentences() throws Exception {
        LSOntology o = loadOntology("steamroller.ls");
        Assert.assertNotNull(o);
        Assert.assertEquals(o.getStatements().size(), 20);
    }

    @Test
    public void testReadOnlyDeclarations() throws Exception {
        LSOntology o = loadOntology("Student.ss");
        Assert.assertNotNull(o);
        Assert.assertEquals(o.getStatements().size(), 0);
        Assert.assertEquals(o.getClasses().size(), 5);
        Assert.assertEquals(o.getBinaryLinks().size(), 7);
    }

    @Test
    public void testReadFullOntology() throws Exception {
        LSOntology o = loadOntology("robots.ls");
        Assert.assertNotNull(o);
        Assert.assertEquals(o.getClassesTerms().size(), 8);
        Assert.assertEquals(o.getBinaryLinksTerms().size(), 1);
        Assert.assertEquals(o.getStatements().size(), 12);
    }

    @Test
    public void testIncorrectOntology() throws Exception {
        try {
            loadOntology("duplicated_and_undeclared.ss");
        }
        catch (UnconvertableException e) {
            return;
        }
        Assert.fail("Should fail with undeclared and duplicated declarations");
    }

    protected LSOntology loadOntology(String fileName) throws UnconvertableException, IOException {
        String s = FileUtils.readFileToString(
                new File(ClassLoader.getSystemResource(fileName).getFile())
        );
        Text2LSOntology converter = new Text2LSOntology();

        return converter.convert(s);

    }
}
