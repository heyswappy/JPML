package Tag.StandardTags.Format;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.HashMap;
import java.util.Map;

import static Tag.TagCentral.BOLD;

public class BoldTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public BoldTag() {
        super(IS_VOID);
    }

    public BoldTag(Style styleData) {
        super(IS_VOID, styleData);
    }

    public BoldTag(Style styleData, Map<String, Object> attributes) {
        super(IS_VOID, styleData, attributes);
    }

    @Override
    public String getTagName() {
        return BOLD.getName();
    }
}
