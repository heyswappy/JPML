package Tag.StandardTags;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.HashMap;
import java.util.Map;

import static Tag.TagCentral.BODY;

public class BodyTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public BodyTag() {
        super(IS_VOID);
    }

    public BodyTag(Style styleData) {
        super(false, styleData);
    }

    public BodyTag( Style styleData, Map<String, Object> attributes) {
        super(false, styleData, attributes);
    }

    @Override
    public String getTagName() {
        return BODY.getName();
    }
}
