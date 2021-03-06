package mpei.bkm.converters.structure2text;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.structure.objectspecification.concept.BKMClass;
import mpei.bkm.model.structure.objectspecification.concept.Concept;
import mpei.bkm.model.structure.objectspecification.concept.BinaryLink;

public class Concept2Text implements Converter<Concept,String> {

    @Override
    public String convert(Concept concept) throws UnconvertableException {
        if (concept instanceof BKMClass)
            return (new BKMClass2Text()).convert((BKMClass) concept);
        else if (concept instanceof BinaryLink)
            return (new BinaryLink2Text()).convert((BinaryLink) concept);
        throw new UnconvertableException("Unknown type concept");
    }
}
