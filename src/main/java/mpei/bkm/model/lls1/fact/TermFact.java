package mpei.bkm.model.lls1.fact;


import mpei.bkm.model.lls1.terms.Term;

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
