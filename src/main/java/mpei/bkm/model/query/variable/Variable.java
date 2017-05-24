package mpei.bkm.model.query.variable;

public class Variable {
    private String name;
    private String concept;

    public Variable(String name, String concept) {
        this.name = name;
        this.concept = concept;
    }
    public Variable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getConcept() {
        return concept;
    }
}
