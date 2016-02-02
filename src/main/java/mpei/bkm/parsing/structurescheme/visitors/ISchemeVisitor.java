package mpei.bkm.parsing.structurescheme.visitors;

import mpei.bkm.model.lss.Attribute;
import mpei.bkm.model.lss.objectspecification.attributes.DataTypeAttribute;
import mpei.bkm.model.lss.objectspecification.concept.BKMClass;
import mpei.bkm.model.structurescheme.Scheme;
import mpei.bkm.model.lss.objectspecification.attributes.ConceptAttribute;
import mpei.bkm.model.lss.objectspecification.concept.BinaryLink;

public interface ISchemeVisitor {
    void visit(DataTypeAttribute attribute);
    void visit(ConceptAttribute attribute);
    void visit(Attribute attribute);
    void visit(BKMClass BKMClass);
    void visit(BinaryLink binaryLink);
    void visit(Scheme scheme);
}
