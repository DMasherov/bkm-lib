package mpei.bkm.converters.scheme2text;

import mpei.bkm.converters.Converter;
import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.lss.Attribute;

import java.util.List;

public class Attributes2TextConverter implements Converter<List<? extends Attribute>,String> {
    @Override
    public String convert(List<? extends Attribute> attributes) throws UnconvertableException {
        if (attributes == null) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        if (attributes.size() > 0) {
            Attribute2TextConverter attribute2TextConverter = new Attribute2TextConverter();
            boolean first = true;
            sb.append("[");
            for (Attribute attribute : attributes) {
                if (!first) {
                    sb.append(",");
                }
                first = false;
                sb.append(attribute2TextConverter.convert(attribute));
            }
            sb.append("]");
        }
        return sb.toString();
    }
}