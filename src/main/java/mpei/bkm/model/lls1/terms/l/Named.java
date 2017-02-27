package mpei.bkm.model.lls1.terms.l;

import mpei.bkm.model.lls1.InnerPart;
import mpei.bkm.utils.identifier.IdentifierCreator;
import mpei.bkm.utils.identifier.IdentifierFactory;

public class Named extends L {
    private String name;

    public Named(String name) {
        super();

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
