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

    @Override
    public String getTagName() {
        return BODY.getName();
    }
}
