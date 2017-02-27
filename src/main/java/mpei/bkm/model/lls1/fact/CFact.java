package mpei.bkm.model.lls1.fact;

import mpei.bkm.model.commonlangfeatures.firstorderterm.Term;
import mpei.bkm.model.lls1.Expression;
import mpei.bkm.model.lls1.terms.c.C;

/**
 * Fact for c-terms.
 */
public class CFact extends TermFact<C> {
    public CFact(Sign sign, C c) {
        super(sign, c);
    }
}
