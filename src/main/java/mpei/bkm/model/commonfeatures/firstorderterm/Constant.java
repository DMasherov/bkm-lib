package mpei.bkm.model.commonfeatures.firstorderterm;

/**
 * Constant as a term in first-order logic.
 */
public class Constant extends Term {
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
