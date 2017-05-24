package mpei.bkm.model.lss.objectspecification.concept;

import mpei.bkm.model.lss.Attribute;

import java.util.ArrayList;
import java.util.List;

public class BKMClass extends Concept {
    protected BKMClass isa;

    public BKMClass(String name) {
        super(name);
    }
    public BKMClass(String name, List<? extends Attribute> attributes) {
        super(name,attributes);
    }
    public BKMClass(String name, BKMClass isa) {
        super(name);
        this.isa = isa;
    }

    public BKMClass getIsa() {
        return isa;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof BKMClass && super.equals(o);
    }

    @Override
    public String toString() {
        return name;
    }
}
