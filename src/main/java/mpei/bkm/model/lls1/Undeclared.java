package mpei.bkm.model.lls1;

public class Undeclared<In> {
    protected String name;
    protected In in;

    public Undeclared(String name, In in) {
        this.name = name;
        this.in = in;
    }

    public String getName() {
        return name;
    }

    public In getIn() {
        return in;
    }

    @Override
    public String toString() {
        return "Undeclared " +
                "name '" + name + '\'' +
                (in == null ? "" : " in " + in)
                ;
    }
}
