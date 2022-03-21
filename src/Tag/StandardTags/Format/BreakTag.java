package Tag.StandardTags.Format;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.BREAK;

public class BreakTag extends AbstractHtmlTag<BreakTag> {
    private static final Boolean IS_VOID = true;

    public BreakTag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return BREAK.getName();
    }
}
