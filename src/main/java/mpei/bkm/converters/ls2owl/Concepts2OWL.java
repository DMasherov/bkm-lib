package mpei.bkm.converters.ls2owl;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.lls1.LSOntology;
import mpei.bkm.model.lls1.terms.c.WithAttributes;
import mpei.bkm.model.lss.objectspecification.concept.BKMClass;
import mpei.bkm.model.lss.objectspecification.concept.BinaryLink;
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
        for (WithAttributes classTerm : lsOnt.getClassesTerms()) {
            declareAxioms.addAll(createDeclareAxioms(classTerm.getBkmClass()));
        }
        for (mpei.bkm.model.lls1.terms.l.WithAttributes linkTerm : lsOnt.getBinaryLinksTerms()) {
            declareAxioms.addAll(createDeclareAxioms(linkTerm.getBinaryLink()));
        }

        return declareAxioms;
    }

    private Set<OWLAxiom> createDeclareAxioms(BKMClass bkmClass) {
        OWLClass owlClass = df.getOWLClass(IRI.create(bkmClass.getName()));
        return Collections.singleton(df.getOWLDeclarationAxiom(owlClass));
    }

    private Set<OWLAxiom> createDeclareAxioms(BinaryLink link) {
        OWLObjectProperty objectProperty = df.getOWLObjectProperty(IRI.create(link.getName()));
        return Collections.singleton(df.getOWLDeclarationAxiom(objectProperty));
    }
}
