package mpei.bkm.converters.ls2owl;

import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.converters.text2ls.Text2LSOntology;
import mpei.bkm.model.logic.LSOntology;
import mpei.bkm.model.logic.statement.IsaC;
import mpei.bkm.model.logic.terms.c.*;
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

public class LsStatement2OwlAxiomsTest extends LS2OwlTest {
    @Test
    public void testComplexStatementConversion() throws OWLOntologyCreationException, UnconvertableException {
        AttributeConstraints emptyConstraints = new AttributeConstraints(Collections.emptyList());
        WithAttributes C1 = new WithAttributes(new BKMClass("C1"), emptyConstraints);
        WithAttributes C2 = new WithAttributes(new BKMClass("C2"), emptyConstraints);
        mpei.bkm.model.logic.terms.l.WithAttributes R =
                new mpei.bkm.model.logic.terms.l.WithAttributes(new BinaryLink("R"), emptyConstraints);

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
}
