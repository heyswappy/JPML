package Tag.StandardTags.Text;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.H4;

public class H4Tag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public H4Tag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return H4.getName();
    }
}
