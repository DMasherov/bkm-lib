package mpei.bkm.model.query.variable;

public class VariableLink {
    private Variable left;
    private Variable link;
    private Variable right;

    public VariableLink(Variable left, Variable link, Variable right) {
        this.left = left;
        this.link = link;
        this.right = right;
    }

    public Variable getLeft() {
        return left;
    }

    public Variable getLink() {
        return link;
    }

    public Variable getRight() {
        return right;
    }
}
