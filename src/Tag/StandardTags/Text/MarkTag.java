package Tag.StandardTags.Text;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.Map;

import static Tag.TagCentral.MARK;

public class MarkTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public MarkTag() {
        super(IS_VOID);
    }

    public MarkTag(Style styleData) {
        super(IS_VOID, styleData);
    }

    public MarkTag(Style styleData, Map<String, Object> attributes) {
        super(IS_VOID, styleData, attributes);
    }

    @Override
    public String getTagName() {
        return MARK.getName();
    }
}
