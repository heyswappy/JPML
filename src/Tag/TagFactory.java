package Tag;


import java.lang.reflect.Constructor;
import java.util.Map;

public class TagFactory {

    public static Tag getTag(String tagName, Map<String, Object> attributes) {
        Constructor constructor = TagCentral.getConstructor(tagName);
        try {
            return (Tag) constructor.newInstance(attributes);
        }
        catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
