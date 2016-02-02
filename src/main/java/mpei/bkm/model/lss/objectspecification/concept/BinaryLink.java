package mpei.bkm.model.lss.objectspecification.concept;

import mpei.bkm.model.lss.Attribute;
import mpei.bkm.model.lss.objectspecification.attributeconditions.ClassAttributeCondition;
import mpei.bkm.model.lss.objectspecification.intervalrestrictions.IntervalRestriction;

import java.util.ArrayList;
import java.util.List;

public class BinaryLink extends Concept {
    private ClassAttributeCondition left;
    private IntervalRestriction restriction;
    private ClassAttributeCondition right;


    public BinaryLink(String name) {
        super(name);
    }

    public BinaryLink(ClassAttributeCondition left, String name, IntervalRestriction restriction, ClassAttributeCondition right, List<? extends Attribute> attributes) {
        super(name,attributes);
        this.left = left;
        this.restriction = restriction;
        this.right = right;
    }

    public ClassAttributeCondition getLeft() {
        return left;
    }

    public IntervalRestriction getRestriction() {
        return restriction;
    }

    public ClassAttributeCondition getRight() {
        return right;
    }


}
