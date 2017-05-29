package mpei.bkm.converters.ls2owl;

import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.converters.text2ls.Text2LSOntology;
import mpei.bkm.model.logic.LSOntology;
import mpei.bkm.model.logic.statement.IsaC;
import mpei.bkm.model.logic.terms.c.*;
import mpei.bkm.model.logic.terms.c.And;
import mpei.bkm.model.logic.terms.c.Not;
import mpei.bkm.model.logic.terms.c.Or;
import mpei.bkm.model.logic.terms.c.WithAttributes;
import mpei.bkm.model.logic.terms.p.Each;
import mpei.bkm.model.logic.terms.p.Only;
import mpei.bkm.model.structure.objectspecification.attributeconstraints.AttributeConstraints;
import mpei.bkm.model.structure.objectspecification.concept.BKMClass;
import mpei.bkm.model.structure.objectspecification.concept.BinaryLink;
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
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LSOnt2OwlOntTest extends LS2OwlTest {
    @Test
    public void testSimpleOnt() throws
            OWLOntologyStorageException, UnconvertableException,
            NoSuchFieldException, IOException, IllegalAccessException, OWLOntologyCreationException {

        OWLOntology convertedToOWL = fileLS2OWLOntology("simple_lsont_for_owl.ls");

        Set<String> classNames = new HashSet<>(Arrays.asList("ABCDE".split("")));
        classNames.add("http://www.w3.org/2002/07/owl#Nothing");
        Assert.assertEquals(
                convertedToOWL.getClassesInSignature().stream().map(c -> c.getIRI().toString()).collect(Collectors.toSet()),
                classNames);

        Set<String> objectPropertiesNames = convertedToOWL.getObjectPropertiesInSignature().stream()
                .map(a -> a.getIRI().toString()).collect(Collectors.toSet());

        Assert.assertEquals(objectPropertiesNames,
                new HashSet<>(Arrays.asList("related_to", "related_to_Name")));

        Assert.assertEquals(convertedToOWL.getDataPropertiesInSignature().size(), 2);

        Set<OWLAxiom> TBoxAxioms = getTBoxAxiomsFromFile("simple_owlont_for_owl.ls");

        Assert.assertEquals(TBoxAxioms, convertedToOWL.getTBoxAxioms(Imports.EXCLUDED));
    }

    @Test
    public void testNoAttributes()  throws
            OWLOntologyStorageException, UnconvertableException,
            NoSuchFieldException, IOException, IllegalAccessException, OWLOntologyCreationException {

        OWLOntology convertedToOWL = fileLS2OWLOntology("robots_no_attributes.ls");

        Assert.assertNotNull(convertedToOWL);

        Set<OWLAxiom> TBoxAxioms = getTBoxAxiomsFromFile("robots_no_attributes.owl");

        Set<OWLAxiom> r = new HashSet<>(TBoxAxioms);
        r.removeAll(new HashSet(convertedToOWL.getTBoxAxioms(Imports.EXCLUDED)));
        Assert.assertEquals(TBoxAxioms.size(), convertedToOWL.getTBoxAxioms(Imports.EXCLUDED).size());

        Assert.assertEquals(TBoxAxioms, convertedToOWL.getTBoxAxioms(Imports.EXCLUDED));
    }

    @Test
    public void testReadNoAttributesComplex()  throws
            OWLOntologyStorageException, NoSuchFieldException, IOException,
            IllegalAccessException, OWLOntologyCreationException {

        try {
            OWLOntology convertedToOWL = fileLS2OWLOntology("steamroller.ls");
        }
        catch (UnconvertableException e) {
            Assert.assertEquals(2, e.getReasons().size());
            return;
        }
        Assert.fail("Should throw unconvertable exception");
    }
}
