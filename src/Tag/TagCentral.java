package Tag;

import Style.Style;
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

    // Constructor
    TagCentral(String name, Class cls) {
        this.name = name;
        this.cls = cls;
    }

    static public Constructor extractConstructor(Class cls, Class[] signature) {
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
