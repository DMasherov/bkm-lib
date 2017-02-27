package mpei.bkm.model.lls1.fact;

import mpei.bkm.model.lls1.Expression;

/**
 * Base case fro of LLS1 facts.
 */
public abstract class Fact<T extends Expression> {
    private Sign sign;
    private T e;

    public Fact(Sign sign, T e) {
        this.sign = sign;
        this.e = e;
    }

    public Sign getSign() {
        return sign;
    }

    public void setSign(Sign sign) {
        this.sign = sign;
    }

    public T getE() {
        return e;
    }

    public void setE(T e) {
        this.e = e;
    }
}
