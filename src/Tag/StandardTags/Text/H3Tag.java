package Tag.StandardTags.Text;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.H3;

public class H3Tag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public H3Tag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return H3.getName();
    }
}
