package mpei.bkm.model.structure.objectspecification.concept;

import mpei.bkm.model.structure.Attribute;

import java.util.List;

public class BKMClass extends Concept {
    public BKMClass(String name) {
        super(name);
    }
    public BKMClass(String name, List<? extends Attribute> attributes) {
        super(name,attributes);
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
