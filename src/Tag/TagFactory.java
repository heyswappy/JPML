package Tag;

import Style.Style;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import Exception.ExceptionUtils;

public class TagFactory {

    // static attribute
    private static final Map<String, Constructor> tagMappingArg1 = new HashMap<String, Constructor>();
    private static final Map<String, Constructor> tagMappingArg2 = new HashMap<String, Constructor>();
    private static final Map<String, Constructor> tagMappingArg3 = new HashMap<String, Constructor>();

    private static final Class[] arg1Signature = {};
    private static final Class[] arg2Signature = {Style.class};
    private static final Class[] arg3signature = {Style.class, Map.class};

    static {
        Arrays.stream(TagCentral.values()).forEach(val ->
                tagMappingArg1.put(val.getName(), TagCentral.extractConstructor(val.getAssociatedClass(), arg1Signature))
        );
        Arrays.stream(TagCentral.values()).forEach(val ->
                tagMappingArg2.put(val.getName(), TagCentral.extractConstructor(val.getAssociatedClass(), arg2Signature))
        );
        Arrays.stream(TagCentral.values()).forEach(val ->
                tagMappingArg3.put(val.getName(), TagCentral.extractConstructor(val.getAssociatedClass(), arg3signature))
        );
    }

    public static HtmlTag getTag(String tagName) {
        Constructor constructor = tagMappingArg1.get(tagName);
        try {
            return (HtmlTag) constructor.newInstance();
        }
        catch (Exception e) {
            throw ExceptionUtils.getTagInstantiationExceptionWithTagNameAndSignature(tagName, arg1Signature, e);
        }
    }

    public static HtmlTag getTag(String tagName, Style styleData) {
        Constructor constructor = tagMappingArg2.get(tagName);
        try {
            return (HtmlTag) constructor.newInstance(styleData);
        }
        catch (Exception e) {
            throw ExceptionUtils.getTagInstantiationExceptionWithTagNameAndSignature(tagName, arg2Signature, e);
        }
    }

    public static HtmlTag getTag(String tagName, Style styleData, Map<String, Object> attributes) {
        Constructor constructor = tagMappingArg3.get(tagName);
        try {
            return (HtmlTag) constructor.newInstance(attributes);
        }
        catch (Exception e) {
            throw ExceptionUtils.getTagInstantiationExceptionWithTagNameAndSignature(tagName, arg3signature, e);
        }
    }
}
