package mpei.bkm.converters.ls2owl;

import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.converters.text2ls.Text2LSOntology;
import mpei.bkm.model.logic.LSOntology;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.model.parameters.Imports;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class LS2OwlTest {
    protected OWLOntology fileLS2OWLOntology(String path)
            throws UnconvertableException, NoSuchFieldException, IllegalAccessException, IOException {
        String ont = FileUtils.readFileToString(
                new File(ClassLoader.getSystemResource(path).getFile()));
        return textLS2OWLOntology(ont);
    }

    protected OWLOntology textLS2OWLOntology(String lsText) throws UnconvertableException, NoSuchFieldException, IllegalAccessException {
        Text2LSOntology converter = new Text2LSOntology();
        LSOntology lsOnt = converter.convert(lsText);
        Field f = LSOntology.class.getDeclaredField("name");
        f.setAccessible(true);
        f.set(lsOnt, "mine");

        LSOntology2OWLOntology ls2owlConverter = new LSOntology2OWLOntology();
        return ls2owlConverter.convert(lsOnt);
    }

    protected Set<OWLAxiom> getTBoxAxiomsFromFile(String path) throws OWLOntologyCreationException, IOException {
        String ont = FileUtils.readFileToString(
                new File(ClassLoader.getSystemResource(path).getFile()));
        return getTBoxAxioms(ont);
    }
    protected Set<OWLAxiom> getTBoxAxioms(String ontText) throws OWLOntologyCreationException {
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        ByteArrayInputStream inputStream = new ByteArrayInputStream(ontText.getBytes());
        return manager.loadOntologyFromOntologyDocument(inputStream).getTBoxAxioms(Imports.EXCLUDED);
    }
}
