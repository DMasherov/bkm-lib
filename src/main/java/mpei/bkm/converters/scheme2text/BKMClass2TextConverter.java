package mpei.bkm.converters.scheme2text;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.lss.objectspecification.concept.BKMClass;

public class BKMClass2TextConverter implements Converter<BKMClass,String> {

    @Override
    public String convert(BKMClass BKMClass) throws UnconvertableException {
        StringBuffer sb = new StringBuffer();
        sb.append(BKMClass.getName());
        Attributes2TextConverter attributes2TextConverter = new Attributes2TextConverter();
        sb.append(attributes2TextConverter.convert(BKMClass.getAttributes()));
        if (BKMClass.getIsa() != null) {
            sb.append(System.getProperty("line.separator") + BKMClass.getName() + "ISA" + BKMClass.getIsa().getName());
        }
        return sb.toString();
    }
}
