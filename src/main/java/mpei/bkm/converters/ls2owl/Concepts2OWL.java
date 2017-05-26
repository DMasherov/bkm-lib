package mpei.bkm.converters.ls2owl;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.logic.LSOntology;
import mpei.bkm.model.logic.terms.c.WithAttributes;
import mpei.bkm.model.structure.Attribute;
import mpei.bkm.model.structure.datatypespecification.datatypes.DataType;
import mpei.bkm.model.structure.datatypespecification.datatypes.PrimitiveDataType;
import mpei.bkm.model.structure.objectspecification.concept.BKMClass;
import mpei.bkm.model.structure.objectspecification.concept.BinaryLink;
import mpei.bkm.model.structure.objectspecification.concept.Concept;
import mpei.bkm.model.structure.objectspecification.concepttypes.ConceptType;
import org.semanticweb.owlapi.model.*;

import java.util.*;

public class Concepts2OWL implements Converter<LSOntology, Set<OWLAxiom>> {
    private OWLOntologyManager manager;
    private OWLOntology owlOntology;
    private OWLDataFactory df;

    public Concepts2OWL(OWLOntologyManager manager, OWLOntology owlOntology) {
        this.manager = manager;
        this.owlOntology = owlOntology;
        this.df = manager.getOWLDataFactory();
    }

    @Override
    public Set<OWLAxiom> convert(LSOntology lsOnt) throws UnconvertableException {

        Set<OWLAxiom> declareAxioms = new HashSet<>();
        for (BKMClass bkmClass : lsOnt.getClasses()) {
            declareAxioms.addAll(createDeclareAxioms(bkmClass));
        }
        for (BinaryLink link : lsOnt.getBinaryLinks()) {
            declareAxioms.addAll(createDeclareAxioms(link));
        }

        return declareAxioms;
    }

    private Set<OWLAxiom> createDeclareAxioms(BKMClass bkmClass) {
        Set<OWLAxiom> axioms = createDeclareAxioms((Concept)bkmClass);

        OWLClass owlClass = df.getOWLClass(IRI.create(bkmClass.getName()));
        axioms.add(df.getOWLDeclarationAxiom(owlClass));
        return axioms;
    }

    private Set<OWLAxiom> createDeclareAxioms(BinaryLink link) {
        Set<OWLAxiom> axioms = createDeclareAxioms((Concept)link);

        OWLObjectProperty objectProperty = df.getOWLObjectProperty(IRI.create(link.getName()));
        axioms.add(df.getOWLDeclarationAxiom(objectProperty));
        return axioms;
    }

    private Set<OWLAxiom> createDeclareAxioms(Concept c) {
        Set<OWLAxiom> axioms = new HashSet<>();
        for (Attribute a : c.getAttributes()) {
            String name = String.format("%s_%s", c.getName(), a.getName());
            if (a.getType() instanceof PrimitiveDataType) {
                OWLDataProperty prop = df.getOWLDataProperty(IRI.create(name));
                axioms.add(df.getOWLDeclarationAxiom(prop));
                axioms.add(df.getOWLFunctionalDataPropertyAxiom(prop));
            }
            else if (a.getType() instanceof ConceptType) {
                OWLObjectProperty prop = df.getOWLObjectProperty(IRI.create(name));
                axioms.add(df.getOWLDeclarationAxiom(prop));
                axioms.add(df.getOWLFunctionalObjectPropertyAxiom(prop));
            }
        }
        return axioms;
    }
}
