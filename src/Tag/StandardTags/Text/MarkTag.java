package Tag.StandardTags.Text;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.MARK;

public class MarkTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public MarkTag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return MARK.getName();
    }
}
