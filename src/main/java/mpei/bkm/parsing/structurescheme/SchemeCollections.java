package mpei.bkm.parsing.structurescheme;

import mpei.bkm.model.lss.objectspecification.concept.BKMClass;
import mpei.bkm.model.lss.objectspecification.attributes.ConceptAttribute;
import mpei.bkm.model.lss.objectspecification.attributes.DataTypeAttribute;
import mpei.bkm.model.lss.objectspecification.concept.BinaryLink;
import mpei.bkm.model.lss.objectspecification.concepttypes.BKMClassType;

import java.util.*;

/**
 * Helper class which allows direct access to BMK classes, links, concept and data type attributes.
 */
public class SchemeCollections {
    public Map<BKMClassType, List<ConceptAttribute>> allBKMClassesInAttributes = new LinkedHashMap<BKMClassType, List<ConceptAttribute>>();

    public Set<BKMClass> allDeclaredBKMClasses = new HashSet<BKMClass>();
    public Set<BinaryLink> allDeclaredBinaryLinks = new HashSet<BinaryLink>();
    public Set<ConceptAttribute> allConceptAttributes = new HashSet<ConceptAttribute>();
    public Set<DataTypeAttribute> allDataTypeAttributes = new HashSet<DataTypeAttribute>();
}
