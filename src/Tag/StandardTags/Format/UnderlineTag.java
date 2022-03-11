package Tag.StandardTags.Format;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.UNDERLINE;

public class UnderlineTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public UnderlineTag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return UNDERLINE.getName();
    }
}
