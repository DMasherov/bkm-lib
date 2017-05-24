package mpei.bkm.model.logic.fact;

import mpei.bkm.model.logic.terms.l.L;

/**
 * Fact for l-terms.
 */
public class LFact extends TermFact<L> {
    public LFact(Sign sign, L l) {
        super(sign, l);
    }
}
