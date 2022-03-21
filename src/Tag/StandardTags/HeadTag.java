package Tag.StandardTags;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.HEAD;

public class HeadTag extends AbstractHtmlTag<HeadTag> {
    private static final Boolean IS_VOID = false;

    public HeadTag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return HEAD.getName();
    }

}
