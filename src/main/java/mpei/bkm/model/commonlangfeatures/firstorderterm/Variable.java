package mpei.bkm.model.commonlangfeatures.firstorderterm;

/**
 * Variable as a term in first-order logic.
 */
public class Variable {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
