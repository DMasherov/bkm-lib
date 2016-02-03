package mpei.bkm.parsing.structurescheme.visitors;

import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.lss.Attribute;
import mpei.bkm.model.lss.objectspecification.attributes.DataTypeAttribute;
import mpei.bkm.model.lss.objectspecification.concept.BKMClass;
import mpei.bkm.model.structurescheme.Scheme;
import mpei.bkm.model.lss.objectspecification.attributes.ConceptAttribute;
import mpei.bkm.model.lss.objectspecification.concept.BinaryLink;

public interface ISchemeVisitor {
    void visit(DataTypeAttribute attribute) throws UnconvertableException;
    void visit(ConceptAttribute attribute) throws UnconvertableException;
    void visit(Attribute attribute) throws UnconvertableException;
    void visit(BKMClass BKMClass) throws UnconvertableException;
    void visit(BinaryLink binaryLink) throws UnconvertableException;
    void visit(Scheme scheme) throws UnconvertableException;
}
