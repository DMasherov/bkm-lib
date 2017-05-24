package mpei.bkm.model.logic.fact;

import mpei.bkm.model.logic.terms.c.C;

/**
 * Fact for c-terms.
 */
public class CFact extends TermFact<C> {
    public CFact(Sign sign, C c) {
        super(sign, c);
    }
}
