package mpei.bkm.model.logic.fact;

import mpei.bkm.model.logic.terms.p.P;

/**
 * Fact for p-terms.
 */
public class PFact extends TermFact<P> {
    public PFact(Sign sign, P p) {
        super(sign, p);
    }
}