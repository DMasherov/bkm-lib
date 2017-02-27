package mpei.bkm.model.lls1.statement;


import mpei.bkm.model.lls1.InnerPart;

public class Named extends Statement {
    @InnerPart
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
