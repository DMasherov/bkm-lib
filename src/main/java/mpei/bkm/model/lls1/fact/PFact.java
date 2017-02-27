package mpei.bkm.model.lls1.fact;

import mpei.bkm.model.lls1.terms.p.P;

/**
 * Fact for p-terms.
 */
public class PFact extends TermFact<P> {
    public PFact(Sign sign, P p) {
        super(sign, p);
    }
}