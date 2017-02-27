package mpei.bkm.model.commonlangfeatures.firstorderterm;

/**
 * Constant as a term in first-order logic.
 */
public class Constant {
    private String name;

    public Constant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
