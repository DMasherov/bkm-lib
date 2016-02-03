package mpei.bkm.parsing.structurescheme.visitors;

import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.lss.objectspecification.concept.BKMClass;
import mpei.bkm.model.lss.objectspecification.concept.Concept;
import mpei.bkm.model.lss.Attribute;
import mpei.bkm.model.lss.objectspecification.attributes.ConceptAttribute;
import mpei.bkm.model.lss.objectspecification.attributes.DataTypeAttribute;
import mpei.bkm.model.lss.objectspecification.concept.BinaryLink;
import mpei.bkm.model.lss.objectspecification.concepttypes.*;
import mpei.bkm.model.structurescheme.Scheme;
import mpei.bkm.parsing.structurescheme.SchemeCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Class for traversing structure scheme tree and collecting BKM classes and links into {@link SchemeCollections}.
 */
public class SchemeCollector implements ISchemeVisitor  {
    private SchemeCollections collections = new SchemeCollections();
    private Set<String> conceptNames = new HashSet<String>();
    /**
     * Gets {@link SchemeCollections} for the given scheme.
     * @return {@link SchemeCollections}
     */
    public SchemeCollections getCollections() {
        if (collections == null) {
            collections = new SchemeCollections();
        }
        return collections;
    }

    public void visitCheck(BKMClassType type,ConceptAttribute attribute) {
        if (collections.allBKMClassesInAttributes.get(type) == null) {
            collections.allBKMClassesInAttributes.put(type,new ArrayList<ConceptAttribute>());
        }
        collections.allBKMClassesInAttributes.get(type).add(attribute);
    }

    public void visitCheck(ConceptType type,ConceptAttribute attribute) {
        if (type instanceof UnionConceptType) {
            visitCheck(((UnionConceptType) type).getLeft(),attribute);
            visitCheck(((UnionConceptType) type).getRight(),attribute);
        }
        else if (type instanceof StarConceptType) {
            visitCheck(((StarConceptType) type).getType(),attribute);
        }
        else if (type instanceof CartessianProductConceptType) {
            for (ConceptType type0: ((CartessianProductConceptType) type).getTypes()) {
                visitCheck(type0,attribute);
            }
        }
        else if (type instanceof BKMClassType) {
            visitCheck(((BKMClassType) type),attribute);
        }
    }

    @Override
    public void visit(DataTypeAttribute attribute) {
        collections.allDataTypeAttributes.add(attribute);
    }
    @Override
    public void visit(ConceptAttribute attribute) {
        collections.allConceptAttributes.add(attribute);
        visitCheck(attribute.getType(), attribute);
    }

    @Override
    public void visit(Attribute attribute) {
        if (attribute instanceof ConceptAttribute) {
            visit((ConceptAttribute)attribute);
        }
        if (attribute instanceof DataTypeAttribute) {
            visit((DataTypeAttribute)attribute);
        }
    }

    @Override
    public void visit(BKMClass bkmClass) {
        conceptNames.add(bkmClass.getName());
        collections.allDeclaredBKMClasses.add(bkmClass);
        for(Attribute attribute : bkmClass.getAttributes()) {
            if (attribute.getConcept() == null)
                attribute.setConcept(bkmClass);
            visit(attribute);
        }
    }
    @Override
    public void visit(BinaryLink binaryLink) {
        collections.allDeclaredBinaryLinks.add(binaryLink);
        for(Attribute attribute : binaryLink.getAttributes()) {
            if (attribute.getConcept() == null)
                attribute.setConcept(binaryLink);
            visit(attribute);
        }
    }
    @Override
    public void visit(Scheme scheme) throws UnconvertableException {
        if (scheme == null)
            throw new UnconvertableException("Could not read scheme.\nUse \"SCHEME 'Name' <Concepts> END\" to specify a BKM scheme.");
        for(Concept concept : scheme.getConceptSet()) {
            if (concept instanceof BKMClass) {
                visit((BKMClass) concept);
            }
            else if (concept instanceof BinaryLink) {
                visit((BinaryLink) concept);
            }
        }
    }
}
