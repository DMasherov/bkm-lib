package mpei.bkm.converters.ls2owl;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.logic.terms.Term;
import mpei.bkm.model.logic.terms.c.*;
import mpei.bkm.model.logic.terms.c.And;
import mpei.bkm.model.logic.terms.c.WithAttributes;
import mpei.bkm.model.logic.terms.c.Not;
import mpei.bkm.model.logic.terms.c.Or;
import mpei.bkm.model.logic.terms.l.*;
import mpei.bkm.model.logic.terms.p.Each;
import mpei.bkm.model.logic.terms.p.Only;
import mpei.bkm.model.logic.terms.p.P;
import mpei.bkm.model.logic.terms.p.Some;
import org.semanticweb.owlapi.model.*;

public class Term2OWL implements Converter<Term, OWLClassExpression> {
    private OWLOntologyManager manager;
    private OWLOntology owlOntology;
    private OWLDataFactory df;

    public Term2OWL(OWLOntologyManager manager, OWLOntology owlOntology) {
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
        if (c instanceof WithAttributes) {
            return df.getOWLClass(IRI.create(((WithAttributes) c).getBkmClass().getName()));
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
        if (p instanceof mpei.bkm.model.logic.terms.p.Some) {
            return df.getOWLObjectSomeValuesFrom(
                    convert(((Some) p).getL()),
                    convert(((Some) p).getC())
            );
        }
        if (p instanceof mpei.bkm.model.logic.terms.p.Only) {
            // TODO redo: this is not correct. Should be both Some and Each, i.e. ∀R.C ⨅ ∃R.C
            return df.getOWLObjectAllValuesFrom(
                    convert(((Only) p).getL()),
                    convert(((Only) p).getC())
            );
        }
        if (p instanceof mpei.bkm.model.logic.terms.p.Each) {
            return df.getOWLObjectAllValuesFrom(
                    convert(((Each) p).getL()),
                    convert(((Each) p).getC())
            );
        }
        if (p instanceof mpei.bkm.model.logic.terms.p.And) {
            return df.getOWLObjectIntersectionOf(
                    convert(((mpei.bkm.model.logic.terms.p.And) p).getLeft()),
                    convert(((mpei.bkm.model.logic.terms.p.And) p).getRight())
            );
        }
        if (p instanceof mpei.bkm.model.logic.terms.p.Or) {
            return df.getOWLObjectUnionOf(
                    convert(((mpei.bkm.model.logic.terms.p.Or) p).getLeft()),
                    convert(((mpei.bkm.model.logic.terms.p.Or) p).getRight())
            );
        }

        if (p instanceof mpei.bkm.model.logic.terms.p.Not) {
            return df.getOWLObjectComplementOf(convert(((mpei.bkm.model.logic.terms.p.Not) p).getNot()));
        }

        throw new IllegalStateException("Unrecognized p-term " + p.toString());
    }

    public OWLObjectPropertyExpression convert(L l) throws UnconvertableException {
        return convert(false, l);
    }

    // TODO refactor when it is clear how to implement "L OR L", "L AND L" and "NOT L"
    public OWLObjectPropertyExpression convert(boolean inverted, L l) throws UnconvertableException {
        if (l instanceof mpei.bkm.model.logic.terms.l.WithAttributes) {
            return df.getOWLObjectProperty(IRI.create(((mpei.bkm.model.logic.terms.l.WithAttributes) l).getBinaryLink().getName()));
        }
        if (l instanceof mpei.bkm.model.logic.terms.l.Inv) {
            OWLObjectPropertyExpression ope = convert(!inverted, l);
            if (!inverted && ope instanceof OWLObjectProperty) {
                return df.getOWLObjectInverseOf((OWLObjectProperty) ope);
            }
            return ope;
        }
        if (l instanceof mpei.bkm.model.logic.terms.l.Or
                || l instanceof mpei.bkm.model.logic.terms.l.And
                || l instanceof mpei.bkm.model.logic.terms.l.Not)
            throw new IllegalStateException(l.toString() + " cannot be implemented in OWL");
        throw new IllegalStateException("Unrecognized l-term " + l.toString());
    }
}
