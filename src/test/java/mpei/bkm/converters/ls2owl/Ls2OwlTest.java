package mpei.bkm.converters.ls2owl;

import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.converters.text2ls.Text2LSOntology;
import mpei.bkm.model.lls1.LSOntology;
import mpei.bkm.model.lls1.statement.IsaC;
import mpei.bkm.model.lls1.terms.c.*;
import mpei.bkm.model.lls1.terms.c.And;
import mpei.bkm.model.lls1.terms.c.Not;
import mpei.bkm.model.lls1.terms.c.Or;
import mpei.bkm.model.lls1.terms.c.WithAttributes;
import mpei.bkm.model.lls1.terms.p.Each;
import mpei.bkm.model.lls1.terms.p.Only;
import mpei.bkm.model.lss.objectspecification.attributeconstraints.AttributeConstraints;
import mpei.bkm.model.lss.objectspecification.concept.BKMClass;
import mpei.bkm.model.lss.objectspecification.concept.BinaryLink;
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

public class Ls2OwlTest {
    protected final String SIMPLE_ONTOLOGY =
            "A ISA B.\n" +
            "EACH A related_to SOME B.\n" +
            "EACH E related_to ONLY B.\n" +
            "NULL A.\n" +
            "(C THAT related_to SOME A) OR D ISA (A OR B THAT related_to SOME C).\n" +
            "EXIST (D OR THOSE (related_to SOME B)).";

    protected final String SIMPLE_OWL_ONTOLOGY =
            "Prefix(:=<http://mpei.ru/bkm//2017/5/16/mine#>)\n" +
            "Prefix(owl:=<http://www.w3.org/2002/07/owl#>)\n" +
            "Prefix(rdf:=<http://www.w3.org/1999/02/22-rdf-syntax-ns#>)\n" +
            "Prefix(xml:=<http://www.w3.org/XML/1998/namespace>)\n" +
            "Prefix(xsd:=<http://www.w3.org/2001/XMLSchema#>)\n" +
            "Prefix(rdfs:=<http://www.w3.org/2000/01/rdf-schema#>)\n" +
            "Ontology(<http://mpei.ru/bkm//2017/5/16/mine>\n" +

            // declarations
            "Declaration(Class(<A>))\n" +
            "Declaration(Class(<B>))\n" +
            "Declaration(Class(<C>))\n" +
            "Declaration(Class(<D>))\n" +
            "Declaration(Class(<E>))\n" +
            "Declaration(ObjectProperty(<related_to>))\n" +

            // A ISA B.
            "SubClassOf(<A> <B>)\n" +
            // EACH A related_to SOME B.
            "SubClassOf(<A> ObjectSomeValuesFrom(<related_to> <B>))\n" +
            // EACH E related_to ONLY B.
            "SubClassOf(<E> ObjectAllValuesFrom(<related_to> <B>))\n" +
            // NULL A
            "EquivalentClasses(<A> owl:Nothing)\n" +
            // (C THAT related_to SOME A) OR D ISA A.
            "SubClassOf(ObjectUnionOf(ObjectIntersectionOf(<C> ObjectSomeValuesFrom(<related_to> <A>)) <D> )\n " +
            "           ObjectIntersectionOf(ObjectUnionOf(<A> <B>) ObjectSomeValuesFrom(<related_to> <C>)))\n" +
            // EXIST (D OR THOSE (related_to SOME B)).
            "ClassAssertion(ObjectUnionOf(<D> ObjectSomeValuesFrom(<related_to> <B>)) _:skolem)\n" +
            ")";

    protected OWLOntology textLS2OWLOntology(String lsText) throws UnconvertableException, NoSuchFieldException, IllegalAccessException {
        Text2LSOntology converter = new Text2LSOntology();
        LSOntology lsOnt = converter.convert(lsText);
        Field f = LSOntology.class.getDeclaredField("name");
        f.setAccessible(true);
        f.set(lsOnt, "mine");

        LSOntology2OWLOntology ls2owlConverter = new LSOntology2OWLOntology();
        return ls2owlConverter.convert(lsOnt);
    }

    protected Set<OWLAxiom> getTBoxAxioms(String ontText) throws OWLOntologyCreationException {
        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        ByteArrayInputStream inputStream = new ByteArrayInputStream(ontText.getBytes());
        return manager.loadOntologyFromOntologyDocument(inputStream).getTBoxAxioms(Imports.EXCLUDED);
    }

    @Test
    public void testComplexStatementConversion() throws OWLOntologyCreationException, UnconvertableException {
        AttributeConstraints emptyConstraints = new AttributeConstraints(Collections.emptyList());
        WithAttributes C1 = new WithAttributes(new BKMClass("C1"), emptyConstraints);
        WithAttributes C2 = new WithAttributes(new BKMClass("C2"), emptyConstraints);
        mpei.bkm.model.lls1.terms.l.WithAttributes R =
                new mpei.bkm.model.lls1.terms.l.WithAttributes(new BinaryLink("R"), emptyConstraints);

        Or orC = new Or(C1, new Those(new Only(R, C2)));
        And andC = new And(orC, new Not(new That(C2, new Each(R, C1))));

        IsaC isa = new IsaC(C1, andC);

        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        OWLOntology owlOntology = manager.createOntology();
        Statement2OWL statement2OWLConverter = new Statement2OWL(manager, owlOntology);

        OWLAxiom axiomFromLS = (OWLAxiom) statement2OWLConverter.convert(isa).toArray()[0];

        String complexClassExpression = "" +
                "Ontology(<whatever>\n" +
                "  SubClassOf(" +
                "    <C1>" +
                "    ObjectIntersectionOf(\n" +
                "      ObjectUnionOf(\n" +
                "        <C1>\n" +
                "        ObjectAllValuesFrom(<R> <C2>)\n" +
                "      )\n" +
                "      ObjectComplementOf(\n" +
                "        ObjectIntersectionOf(\n" +
                "          <C2>\n" +
                "          ObjectAllValuesFrom(<R> <C1>)\n" +
                "        )\n" +
                "      )\n" +
                "    )\n" +
                "  )\n" +
                ")";
        OWLAxiom axiomFromOWL = (OWLAxiom) getTBoxAxioms(complexClassExpression).toArray()[0];

        Assert.assertEquals(axiomFromOWL, axiomFromLS);
    }

    @Test
    public void testSimpleOnt() throws
            OWLOntologyStorageException, UnconvertableException,
            NoSuchFieldException, IOException, IllegalAccessException, OWLOntologyCreationException {

        OWLOntology convertedToOWL = textLS2OWLOntology(SIMPLE_ONTOLOGY);

        Set<String> classNames = new HashSet<>(Arrays.asList("ABCDE".split("")));
        classNames.add("http://www.w3.org/2002/07/owl#Nothing");
        Assert.assertEquals(
                convertedToOWL.getClassesInSignature().stream().map(c -> c.getIRI().toString()).collect(Collectors.toSet()),
                classNames);


        Assert.assertEquals(convertedToOWL.getObjectPropertiesInSignature().size(), 1);
        Assert.assertEquals(
                convertedToOWL.getObjectPropertiesInSignature().toArray()[0].toString(),
                "<related_to>");

        Set<OWLAxiom> TBoxAxioms = getTBoxAxioms(SIMPLE_OWL_ONTOLOGY);

        Assert.assertEquals(TBoxAxioms, convertedToOWL.getTBoxAxioms(Imports.EXCLUDED));
    }

    @Test
    public void testNoAttributes()  throws
            OWLOntologyStorageException, UnconvertableException,
            NoSuchFieldException, IOException, IllegalAccessException, OWLOntologyCreationException {

        String textNoAttributesOnt = FileUtils.readFileToString(
                new File(ClassLoader.getSystemResource("robots_no_attributes.ls").getFile()));
        OWLOntology convertedToOWL = textLS2OWLOntology(textNoAttributesOnt);

        Assert.assertNotNull(convertedToOWL);

        String robotsInOWL = FileUtils.readFileToString(
                new File(ClassLoader.getSystemResource("robots_no_attributes.owl").getFile()));

        Set<OWLAxiom> TBoxAxioms = getTBoxAxioms(robotsInOWL);

        Set<OWLAxiom> r = new HashSet<>(TBoxAxioms);
        r.removeAll(new HashSet(convertedToOWL.getTBoxAxioms(Imports.EXCLUDED)));
        Assert.assertEquals(TBoxAxioms.size(), convertedToOWL.getTBoxAxioms(Imports.EXCLUDED).size());

        Assert.assertEquals(TBoxAxioms, convertedToOWL.getTBoxAxioms(Imports.EXCLUDED));
    }
}
