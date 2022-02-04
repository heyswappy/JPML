package Tag.StandardTags.Format;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.HashMap;
import java.util.Map;

import static Tag.TagCentral.BREAK;

public class BreakTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = true;

    public BreakTag() {
        super(IS_VOID);
    }

    public BreakTag(Style styleData) {
        super(IS_VOID, styleData);
    }

    public BreakTag(Style styleData, Map<String, Object> attributes) {
        super(true, styleData, attributes);
    }

    @Override
    public String getTagName() {
        return BREAK.getName();
    }
}
