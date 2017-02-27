package mpei.bkm.model.lls1.terms.c;

import mpei.bkm.model.lls1.InnerPart;

public class ConceptVariable extends C {
    @InnerPart
    private C c;
    @InnerPart
    private String varName;

    public ConceptVariable(C c, String varName) {
        super();

        this.c = c;
        this.varName = varName;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }
}
