package mpei.bkm.model.logic.fact;


import mpei.bkm.model.logic.terms.Term;

/**
 * Implementation of LLS1 facts about LLS1 terms.
 */
public abstract class TermFact<T extends Term> extends Fact<T> {
    private T term;

    public TermFact(Sign sign, T term) {
        super(sign, term);
    }

    public T getTerm() {
        return term;
    }

    public void setTerm(T term) {
        this.term = term;
    }
}
