package mpei.bkm.model.logic.terms.l;

import mpei.bkm.model.commonfeatures.ExpressionFactory;

@ExpressionFactory
public class LCreator {
    public static  mpei.bkm.model.logic.terms.l.And AND(L left, L right) {
        return new And(left, right);
    }
    public static  Inv INV(L l) {
        return new Inv(l);
    }
    public static  Not NOT(L L) {
        return new Not(L);
    }
    public static  Or OR(L left, L right) {
        return new Or(left, right);
    }
}
