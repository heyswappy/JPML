package Tag.StandardTags.Text;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.SUBSCRIPT;

public class SubscriptTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public SubscriptTag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return SUBSCRIPT.getName();
    }
}
