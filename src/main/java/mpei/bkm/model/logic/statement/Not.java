package mpei.bkm.model.logic.statement;

import mpei.bkm.model.commonfeatures.InnerPart;

public class Not extends Statement {
    @InnerPart
    private Statement s;

    public Not(Statement s) {
        super();

        this.s = s;
    }

    public Statement getS() {
        return s;
    }

    public void setS(Statement s) {
        this.s = s;
    }
}