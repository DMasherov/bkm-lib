package mpei.bkm.model.lss;

public class Function {
    private String name;
    private String body;

    public Function(String name, String body) {
        this.name = name;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public String getBody() {
        return body;
    }
}
