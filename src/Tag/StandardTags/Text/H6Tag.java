package Tag.StandardTags.Text;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.H6;

public class H6Tag extends AbstractHtmlTag<H6Tag> {
    private static final Boolean IS_VOID = false;

    public H6Tag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return H6.getName();
    }
}
