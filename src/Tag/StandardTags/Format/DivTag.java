package Tag.StandardTags.Format;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.Map;

import static Tag.TagCentral.DIV;

public class DivTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public DivTag() {
        super(IS_VOID);
    }

    public DivTag(Style styleData) {
        super(IS_VOID, styleData);
    }

    public DivTag(Style styleData, Map<String, Object> attributes) {
        super(IS_VOID, styleData, attributes);
    }

    @Override
    public String getTagName() {
        return DIV.getName();
    }
}
