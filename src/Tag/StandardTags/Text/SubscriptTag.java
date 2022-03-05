package Tag.StandardTags.Text;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.Map;

import static Tag.TagCentral.SUBSCRIPT;

public class SubscriptTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public SubscriptTag() {
        super(IS_VOID);
    }

    public SubscriptTag(Style styleData) {
        super(IS_VOID, styleData);
    }

    public SubscriptTag(Style styleData, Map<String, Object> attributes) {
        super(IS_VOID, styleData, attributes);
    }

    @Override
    public String getTagName() {
        return SUBSCRIPT.getName();
    }
}
