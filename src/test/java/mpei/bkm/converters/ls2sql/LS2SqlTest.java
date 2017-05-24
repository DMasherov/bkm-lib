package mpei.bkm.converters.ls2sql;

import mpei.bkm.converters.text2ls.Text2LSOntology;
import mpei.bkm.model.lls1.LSOntology;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import java.io.File;

public class LS2SqlTest {
    @Test
    public void testEquals() throws Exception {
        String fileContent = FileUtils.readFileToString(new File(ClassLoader.getSystemResource("Student.ss").getFile()));

        Text2LSOntology lsConverter = new Text2LSOntology();

        LSOntology lsOntology = lsConverter.convert(fileContent);

        LS2Sql converter = new LS2Sql();

        String script = converter.convert(lsOntology);

        Assert.assertNotNull(script);
    }
}