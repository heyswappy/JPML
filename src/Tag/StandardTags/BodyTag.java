package Tag.StandardTags;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.BODY;

public class BodyTag extends AbstractHtmlTag<BodyTag> {
    private static final Boolean IS_VOID = false;

    public BodyTag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return BODY.getName();
    }
}
