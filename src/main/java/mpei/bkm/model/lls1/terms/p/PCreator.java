package mpei.bkm.model.lls1.terms.p;

import mpei.bkm.model.lls1.ExpressionFactory;
import mpei.bkm.model.lls1.terms.c.C;
import mpei.bkm.model.lls1.terms.l.L;

@ExpressionFactory
public class PCreator {
    public static And AND(P left, P right) {
        return new And(left, right);
    }
    public static Each EACH(L l, C c) {
        return new Each(l, c);
    }
    public static Not NOT(P p) {
        return new Not(p);
    }
    public static Only ONLY(L l, C c) {
        return new Only(l, c);
    }
    public static Or OR(P left, P right) {
        return new Or(left, right);
    }
    public static PredicateVariable PREDICATEVARIABLE(L l, String name) {
        return new PredicateVariable(l, name);
    }
    public static Some SOME(L l, C c) {
        return new Some(l, c);
    }
    public static SurrogateVariable SURROGATEVARIABLE(L l, String surr) {
        return new SurrogateVariable(l, surr);
    }
}
