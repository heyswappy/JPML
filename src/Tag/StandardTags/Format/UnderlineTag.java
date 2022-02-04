package Tag.StandardTags.Format;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.HashMap;
import java.util.Map;

import static Tag.TagCentral.UNDERLINE;

public class UnderlineTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public UnderlineTag() {
        super(IS_VOID);
    }

    public UnderlineTag(Style styleData) {
        super(false, styleData);
    }

    public UnderlineTag( Style styleData, Map<String, Object> attributes) {
        super(false, styleData, attributes);
    }

    @Override
    public String getTagName() {
        return UNDERLINE.getName();
    }
}
