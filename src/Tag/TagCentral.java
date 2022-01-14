package Tag;

import Tag.StandardTags.BodyTag;
import Tag.StandardTags.Format.BoldTag;
import Tag.StandardTags.Format.BreakTag;
import Tag.StandardTags.Format.RuleTag;
import Tag.StandardTags.HeadTag;
import Tag.StandardTags.HtmlTag;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public enum TagCentral {
    // Tags

    BODY ("body", BodyTag.class),
    BOLD ("b", BoldTag.class),
    BREAK ("br", BreakTag.class),
    HEAD ("head", HeadTag.class),
    HTML ("html", HtmlTag.class),
    ITALIC ("i", BoldTag.class),
    RULE ("hr", RuleTag.class),
    UNDERLINE ("u", BoldTag.class);

    // Enum attribute
    private final String name;
    private final Class cls;

    // static attribute
    private static final Map<String, Constructor> tagMapping = new HashMap<String, Constructor>();
    private static final Class[] signature = {Map.class};

    static {
        Arrays.stream(TagCentral.values()).forEach(val ->
            tagMapping.put(val.getName(), extractConstructor(val.getAssociatedClass()))
        );
    }

    // Constructor
    TagCentral(String name, Class cls) {
        this.name = name;
        this.cls = cls;
    }

    // static methods
    static public Constructor getConstructor(String tagName) {
        return tagMapping.get(tagName);
    }

    static private Constructor extractConstructor(Class cls) {
        try {
            System.out.println(cls.getName());
            return cls.getConstructor(signature);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public String getName() {
        return name;
    }

    public Class getAssociatedClass() {
        return cls;
    }
}
