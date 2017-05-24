package mpei.bkm.model.query;


public class LinkCondition extends Condition {
    private String leftVariableName;
    private String linkName;
    private String linkVariableName;
    private String rightVariableName;

    public LinkCondition(String leftVariableName, String linkName, String linkVariableName, String rightVariableName) {
        this.leftVariableName = leftVariableName;
        this.linkName = linkName;
        this.linkVariableName = linkVariableName;
        this.rightVariableName = rightVariableName;
    }

    public LinkCondition(String leftVariableName, String linkName, String rightVariableName) {
        this.leftVariableName = leftVariableName;
        this.linkName = linkName;
        this.rightVariableName = rightVariableName;
    }

    public String getLeftVariableName() {
        return leftVariableName;
    }

    public void setLeftVariableName(String leftVariableName) {
        this.leftVariableName = leftVariableName;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getLinkVariableName() {
        return linkVariableName;
    }

    public void setLinkVariableName(String linkVariableName) {
        this.linkVariableName = linkVariableName;
    }

    public String getRightVariableName() {
        return rightVariableName;
    }

    public void setRightVariableName(String rightVariableName) {
        this.rightVariableName = rightVariableName;
    }
}
