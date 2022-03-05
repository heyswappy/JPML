package Tag;

import Tag.StandardTags.BodyTag;
import Tag.StandardTags.Format.BoldTag;
import Tag.StandardTags.Format.BreakTag;
import Tag.StandardTags.Format.DivTag;
import Tag.StandardTags.Format.RuleTag;
import Tag.StandardTags.HeadTag;
import Tag.StandardTags.HtmlTag;

import java.lang.reflect.Constructor;

import Exception.ExceptionUtils;
import Tag.StandardTags.List.ListItem;
import Tag.StandardTags.List.OList;
import Tag.StandardTags.List.UList;
import Tag.StandardTags.Table.*;
import Tag.StandardTags.Text.*;

public enum TagCentral {
    // Tags
    BODY ("body", BodyTag.class),
    BOLD ("b", BoldTag.class),
    COLUMN("col", ColumnTag.class),
    COLUMN_GROUP("colgroup", ColumnGroupTag.class),
    BREAK ("br", BreakTag.class),
    DIV("div", DivTag.class),
    HEAD ("head", HeadTag.class),
    HTML ("html", HtmlTag.class),
    H1("h1", H1Tag.class),
    H2("h2", H2Tag.class),
    H3("h3", H3Tag.class),
    H4("h4", H4Tag.class),
    H5("h5", H5Tag.class),
    H6("h6", H6Tag.class),
    ITALIC ("i", BoldTag.class),
    LIST_ITEM("li", ListItem.class),
    MARK("mark", MarkTag.class),
    O_LIST("ol", OList.class),
    PARAGRAPH("p", ParagraphTag.class),
    RULE ("hr", RuleTag.class),
    SUBSCRIPT("sub", SubscriptTag.class),
    SUPERSCRIPT("sup", SubscriptTag.class),
    TABLE("table", TableTag.class),
    TABLE_DATA("td", TableDataTag.class),
    TABLE_HEADER("th", TableHeaderTag.class),
    TABLE_ROW("tr", TableRowTag.class),
    UNDERLINE ("u", BoldTag.class),
    U_LIST("ul", UList.class);

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
            throw ExceptionUtils.getConstructorNotFoundExceptionWithClassAndSignature(cls, signature, e);
        }
    }

    public String getName() {
        return name;
    }

    public Class getAssociatedClass() {
        return cls;
    }
}
