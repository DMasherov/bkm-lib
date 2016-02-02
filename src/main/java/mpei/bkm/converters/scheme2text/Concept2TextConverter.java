package mpei.bkm.converters.scheme2text;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.lss.objectspecification.concept.BKMClass;
import mpei.bkm.model.lss.objectspecification.concept.Concept;
import mpei.bkm.model.lss.objectspecification.concept.BinaryLink;

public class Concept2TextConverter implements Converter<Concept,String> {

    @Override
    public String convert(Concept concept) throws UnconvertableException {
        if (concept instanceof BKMClass)
            return (new BKMClass2TextConverter()).convert((BKMClass) concept);
        else if (concept instanceof BinaryLink)
            return (new BinaryLink2TextConverter()).convert((BinaryLink) concept);
        throw new UnconvertableException("Unknown type concept");
    }
}
