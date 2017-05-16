package mpei.bkm.converters.ls2owl;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.lls1.statement.*;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;

import java.util.HashSet;
import java.util.Set;

public class Statement2OWLConverter implements Converter<Statement, Set<OWLAxiom>> {    private OWLOntologyManager manager;
    private OWLOntology owlOntology;
    private OWLDataFactory df;

    public Statement2OWLConverter(OWLOntologyManager manager, OWLOntology owlOntology) {
        this.manager = manager;
        this.owlOntology = owlOntology;
        this.df = manager.getOWLDataFactory();
    }

    @Override
    public Set<OWLAxiom> convert(Statement e) throws UnconvertableException {
        if (e instanceof mpei.bkm.model.lls1.statement.And
                || e instanceof mpei.bkm.model.lls1.statement.Imp
                || e instanceof mpei.bkm.model.lls1.statement.Not
                || e instanceof mpei.bkm.model.lls1.statement.Or)
            throw new IllegalStateException("Not yet implemented");

        Set<OWLAxiom> axioms = new HashSet<>();
        Term2OWLAxiomConverter termConverter = new Term2OWLAxiomConverter(manager, owlOntology);
        if (e instanceof mpei.bkm.model.lls1.statement.IsaC) {
            axioms.add(df.getOWLSubClassOfAxiom(
                termConverter.convert(((IsaC) e).getSub()),
                termConverter.convert(((IsaC) e).getSup())
            ));
        }

        if (e instanceof mpei.bkm.model.lls1.statement.IsaL) {
            axioms.add(df.getOWLSubObjectPropertyOfAxiom(
                termConverter.convert(((IsaL)e).getSub()),
                termConverter.convert(((IsaL)e).getSup())
            ));
        }

        if (e instanceof mpei.bkm.model.lls1.statement.ExistC) {
            axioms.add(df.getOWLClassAssertionAxiom(
                termConverter.convert(((ExistC) e).getC()),
                df.getOWLAnonymousIndividual()
            ));
        }

        if (e instanceof mpei.bkm.model.lls1.statement.ExistL) {
            axioms.add(df.getOWLObjectPropertyAssertionAxiom(
                termConverter.convert(((ExistL) e).getL()),
                df.getOWLAnonymousIndividual(),
                df.getOWLAnonymousIndividual()
            ));
        }

        if (e instanceof mpei.bkm.model.lls1.statement.EqualC) {
            axioms.add(df.getOWLEquivalentClassesAxiom(
                termConverter.convert(((EqualC) e).getLeft()),
                termConverter.convert(((EqualC) e).getRight())
            ));
        }

        if (e instanceof mpei.bkm.model.lls1.statement.EqualL) {
            axioms.add(df.getOWLEquivalentObjectPropertiesAxiom(
                termConverter.convert(((EqualL) e).getLeft()),
                termConverter.convert(((EqualL) e).getRight())
            ));
        }

        if (e instanceof mpei.bkm.model.lls1.statement.EqualP) {
            axioms.add(df.getOWLEquivalentClassesAxiom(
                    termConverter.convert(((EqualP) e).getLeft()),
                    termConverter.convert(((EqualP) e).getRight())
            ));
        }

        if (e instanceof mpei.bkm.model.lls1.statement.Each) {
            axioms.add(df.getOWLSubClassOfAxiom(
                termConverter.convert(((Each) e).getC()),
                termConverter.convert(((Each) e).getP())
            ));
        }

        if (e instanceof mpei.bkm.model.lls1.statement.Some) {
            axioms.add(df.getOWLClassAssertionAxiom(
                df.getOWLObjectIntersectionOf(
                    termConverter.convert(((Some) e).getC()),
                    termConverter.convert(((Some) e).getP())
                ),
                df.getOWLAnonymousIndividual()
            ));
        }

        if (e instanceof mpei.bkm.model.lls1.statement.NullC) {
            axioms.add(df.getOWLEquivalentClassesAxiom(
                termConverter.convert(((NullC) e).getC()),
                df.getOWLNothing()
            ));
        }

        // range D: ⊤ ⊑ ∀p.D
        // domain C: ⊤ ⊑ ∀p-1.C
        if (e instanceof mpei.bkm.model.lls1.statement.NullL) {
            axioms.add(df.getOWLObjectPropertyDomainAxiom(
                    termConverter.convert(((NullL) e).getL()),
                    df.getOWLNothing()
            ));
            axioms.add(df.getOWLObjectPropertyRangeAxiom(
                    termConverter.convert(((NullL) e).getL()),
                    df.getOWLNothing()
            ));
        }

        return axioms;
    }
}
