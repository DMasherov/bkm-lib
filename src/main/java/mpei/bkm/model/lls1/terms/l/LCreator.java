package mpei.bkm.model.lls1.terms.l;

import mpei.bkm.model.lls1.ExpressionFactory;

@ExpressionFactory
public class LCreator {
    public static  mpei.bkm.model.lls1.terms.l.And AND(L left, L right) {
        return new And(left, right);
    }
    public static  Inv INV(L l) {
        return new Inv(l);
    }
    public static  Named NAME(String name) {
        return new Named(name);
    }
    public static  Not NOT(L L) {
        return new Not(L);
    }
    public static  Or OR(L left, L right) {
        return new Or(left, right);
    }
}
