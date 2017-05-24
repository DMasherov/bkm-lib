package mpei.bkm.model.commonlangfeatures.firstorderterm;

/**
 * Surrogate as object identifier.
 */
public class Surrogate extends Term {
    private String name;

    public Surrogate(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
