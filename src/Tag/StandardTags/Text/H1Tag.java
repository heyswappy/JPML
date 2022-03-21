package Tag.StandardTags.Text;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.H1;

public class H1Tag extends AbstractHtmlTag<H1Tag> {
    private static final Boolean IS_VOID = false;

    public H1Tag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return H1.getName();
    }
}
