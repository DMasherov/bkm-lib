package mpei.bkm.parsing.structurescheme;

import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.lss.objectspecification.concept.BKMClass;
import mpei.bkm.model.structurescheme.Scheme;
import mpei.bkm.parsing.structurescheme.visitors.SchemeCollector;
import mpei.bkm.model.lss.objectspecification.attributes.ConceptAttribute;
import mpei.bkm.model.lss.objectspecification.concepttypes.BKMClassType;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Transformer;

import java.util.*;

/**
 * SchemeContainer is a helper class for scheme, it creates BKM classes and links collections and generates the error list.
 * @see Scheme
 * @see SchemeCollections
 */
public class SchemeContainer {
    private Scheme scheme;

    private SchemeCollections collections = new SchemeCollections();

    public Map<BKMClassType,List<ConceptAttribute>> undefinedConceptsInAttributes = new LinkedHashMap<BKMClassType, List<ConceptAttribute>>();

    public SchemeContainer(Scheme scheme) throws UnconvertableException {
        SchemeCollector schemeCollector = new SchemeCollector();
        schemeCollector.visit(scheme);

        this.scheme = scheme;
        this.collections = schemeCollector.getCollections();
        findUndefinedConceptsInAttributes();
    }

    private void findUndefinedConceptsInAttributes() {
        Collection declaredClassesNames = CollectionUtils.collect(collections.allDeclaredBKMClasses, new Transformer() {
            public Object transform(Object o) {
                return ((BKMClass) o).getName();
            }
        });
        undefinedConceptsInAttributes = new LinkedHashMap<BKMClassType, List<ConceptAttribute>>();
        for (Map.Entry<BKMClassType,List<ConceptAttribute>> entry : collections.allBKMClassesInAttributes.entrySet()) {
            if (!declaredClassesNames.contains(entry.getKey().getBKMClass().getName())) {
                undefinedConceptsInAttributes.put(entry.getKey(),entry.getValue());
            }
        }
    }

    /**
     * Gets scheme.
     * @return {@link Scheme}
     */
    public Scheme getScheme() {
        return scheme;
    }

    /**
     * Gets helper scheme collections.
     * @return {@link SchemeCollections}
     */
    public SchemeCollections getCollections() {
        return collections;
    }

    /**
     * Gets all undefined concepts finded when traversing scheme tree.
     * @return {@link Map<  mpei.bkm.model.lss.objectspecification.concepttypes.BKMClassType , List<ConceptAttribute>>}
     */
    public Map<BKMClassType, List<ConceptAttribute>> getUndefinedConceptsInAttributes() {
        return undefinedConceptsInAttributes;
    }
}
