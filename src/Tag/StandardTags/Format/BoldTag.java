package Tag.StandardTags.Format;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.BOLD;

public class BoldTag extends AbstractHtmlTag<BoldTag> {
    private static final Boolean IS_VOID = false;

    public BoldTag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return BOLD.getName();
    }
}
