package mpei.bkm.model.lls1.terms.c;

import mpei.bkm.utils.identifier.IdentifierCreator;
import mpei.bkm.utils.identifier.IdentifierFactory;

public class Named extends C {
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
