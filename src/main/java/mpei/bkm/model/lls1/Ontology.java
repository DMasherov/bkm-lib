package mpei.bkm.model.lls1;

import mpei.bkm.model.lls1.statement.Statement;

import java.util.ArrayList;
import java.util.List;

/**
 * Representation of a LLS1 ontology.
 */
public class Ontology {
    private String name;

    private List<Statement> statements = new ArrayList<Statement>();

    public Ontology(String name, List<Statement> statements) {
        this.name = name;
        this.statements = statements;
    }

    public Ontology(List<Statement> statements) {
        this.name = "anonymous";
        this.statements = statements;
    }

    public String getName() {
        return name;
    }

    public List<Statement> getStatements() {
        return statements;
    }
}
