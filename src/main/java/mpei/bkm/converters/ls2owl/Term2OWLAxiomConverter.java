package mpei.bkm.converters.ls2owl;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.lls1.terms.Term;
import mpei.bkm.model.lls1.terms.c.*;
import mpei.bkm.model.lls1.terms.c.And;
import mpei.bkm.model.lls1.terms.c.Named;
import mpei.bkm.model.lls1.terms.c.Not;
import mpei.bkm.model.lls1.terms.c.Or;
import mpei.bkm.model.lls1.terms.l.*;
import mpei.bkm.model.lls1.terms.p.Each;
import mpei.bkm.model.lls1.terms.p.Only;
import mpei.bkm.model.lls1.terms.p.P;
import mpei.bkm.model.lls1.terms.p.Some;
import org.semanticweb.owlapi.model.*;

public class Term2OWLAxiomConverter implements Converter<Term, OWLClassExpression> {
    private OWLOntologyManager manager;
    private OWLOntology owlOntology;
    private OWLDataFactory df;

    public Term2OWLAxiomConverter(OWLOntologyManager manager, OWLOntology owlOntology) {
        this.manager = manager;
        this.owlOntology = owlOntology;
        this.df = manager.getOWLDataFactory();
    }

    @Override
    public OWLClassExpression convert(Term term) throws UnconvertableException {
        if (term instanceof C)
            return convert((C)term);
        if (term instanceof P)
            return convert((P)term);
        throw new IllegalStateException("Unrecognized term " + term.toString());
    }

    public OWLClassExpression convert(C c) throws UnconvertableException {
        if (c instanceof Named) {
            return df.getOWLClass(IRI.create(((Named) c).getBkmClass().getName()));
        }
        if (c instanceof Or) {
            return df.getOWLObjectUnionOf(
                    convert(((Or)c).getLeft()),
                    convert(((Or)c).getRight()));
        }
        if (c instanceof And) {
            return df.getOWLObjectIntersectionOf(
                    convert(((And) c).getLeft()),
                    convert(((And) c).getRight()));
        }
        if (c instanceof Not) {
            return df.getOWLObjectComplementOf(convert(((Not)c).getC()));
        }
        if (c instanceof That) {
            return df.getOWLObjectIntersectionOf(
                    convert(((That) c).getC()),
                    convert(((That) c).getP())
            );
        }
        if (c instanceof Those) {
            return convert(((Those) c).getP());
        }
        throw new IllegalStateException("Unrecognized c-term " + c.toString());
    }

    public OWLClassExpression convert(P p) throws UnconvertableException {
        if (p instanceof mpei.bkm.model.lls1.terms.p.Some) {
            return df.getOWLObjectSomeValuesFrom(
                    convert(((Some) p).getL()),
                    convert(((Some) p).getC())
            );
        }
        if (p instanceof mpei.bkm.model.lls1.terms.p.Only) {
            // TODO redo: this is not correct. Should be both Some and Each, i.e. ∀R.C ⨅ ∃R.C
            return df.getOWLObjectAllValuesFrom(
                    convert(((Only) p).getL()),
                    convert(((Only) p).getC())
            );
        }
        if (p instanceof mpei.bkm.model.lls1.terms.p.Each) {
            return df.getOWLObjectAllValuesFrom(
                    convert(((Each) p).getL()),
                    convert(((Each) p).getC())
            );
        }
        if (p instanceof mpei.bkm.model.lls1.terms.p.And) {
            return df.getOWLObjectIntersectionOf(
                    convert(((mpei.bkm.model.lls1.terms.p.And) p).getLeft()),
                    convert(((mpei.bkm.model.lls1.terms.p.And) p).getRight())
            );
        }
        if (p instanceof mpei.bkm.model.lls1.terms.p.Or) {
            return df.getOWLObjectUnionOf(
                    convert(((mpei.bkm.model.lls1.terms.p.Or) p).getLeft()),
                    convert(((mpei.bkm.model.lls1.terms.p.Or) p).getRight())
            );
        }

        if (p instanceof mpei.bkm.model.lls1.terms.p.Not) {
            return df.getOWLObjectComplementOf(convert(((mpei.bkm.model.lls1.terms.p.Not) p).getNot()));
        }

        throw new IllegalStateException("Unrecognized p-term " + p.toString());
    }

    public OWLObjectPropertyExpression convert(L l) throws UnconvertableException {
        return convert(false, l);
    }

    // TODO refactor when it is clear how to implement "L OR L", "L AND L" and "NOT L"
    public OWLObjectPropertyExpression convert(boolean inverted, L l) throws UnconvertableException {
        if (l instanceof mpei.bkm.model.lls1.terms.l.Named) {
            return df.getOWLObjectProperty(IRI.create(((mpei.bkm.model.lls1.terms.l.Named) l).getBinaryLink().getName()));
        }
        if (l instanceof mpei.bkm.model.lls1.terms.l.Inv) {
            OWLObjectPropertyExpression ope = convert(!inverted, l);
            if (!inverted && ope instanceof OWLObjectProperty) {
                return df.getOWLObjectInverseOf((OWLObjectProperty) ope);
            }
            return ope;
        }
        if (l instanceof mpei.bkm.model.lls1.terms.l.Or
                || l instanceof mpei.bkm.model.lls1.terms.l.And
                || l instanceof mpei.bkm.model.lls1.terms.l.Not)
            throw new IllegalStateException(l.toString() + " cannot be implemented in OWL");
        throw new IllegalStateException("Unrecognized l-term " + l.toString());
    }
}
