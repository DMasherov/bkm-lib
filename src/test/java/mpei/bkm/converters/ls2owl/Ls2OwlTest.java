package mpei.bkm.converters.ls2owl;

import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.converters.ls2owl.LSOntology2OWLOntology;
import mpei.bkm.converters.text2ls.Text2LSOntology;
import mpei.bkm.model.lls1.LSOntology;
import org.junit.Assert;
import org.junit.Test;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.model.parameters.Imports;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
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

    @Test
    public void testSimpleOnt() throws
            OWLOntologyStorageException, UnconvertableException,
            NoSuchFieldException, IOException, IllegalAccessException, OWLOntologyCreationException {

        Text2LSOntology converter = new Text2LSOntology();
        LSOntology lsOnt = converter.convert(SIMPLE_ONTOLOGY);
        Field f = LSOntology.class.getDeclaredField("name");
        f.setAccessible(true);
        f.set(lsOnt, "mine");

        LSOntology2OWLOntology ls2owlConverter = new LSOntology2OWLOntology();
        OWLOntology convertedToOWL = ls2owlConverter.convert(lsOnt);


        Set<String> classNames = new HashSet<>(Arrays.asList("ABCDE".split("")));
        classNames.add("http://www.w3.org/2002/07/owl#Nothing");
        Assert.assertEquals(
                convertedToOWL.getClassesInSignature().stream().map(c -> c.getIRI().toString()).collect(Collectors.toSet()),
                classNames);

        Assert.assertEquals(convertedToOWL.getObjectPropertiesInSignature().size(), 1);
        Assert.assertEquals(
                convertedToOWL.getObjectPropertiesInSignature().toArray()[0].toString(),
                "<related_to>");

        OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
        ByteArrayInputStream inputStream = new ByteArrayInputStream(SIMPLE_OWL_ONTOLOGY.getBytes());

        Set<OWLAxiom> TBoxAxioms = manager.loadOntologyFromOntologyDocument(inputStream).getTBoxAxioms(Imports.EXCLUDED);

        Assert.assertEquals(TBoxAxioms, convertedToOWL.getTBoxAxioms(Imports.EXCLUDED));

//        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
//        convertedToOWL.saveOntology(new FunctionalSyntaxDocumentFormat(), byteStream);
//        String result = byteStream.toString();
//        System.out.println(result);

    }
}
