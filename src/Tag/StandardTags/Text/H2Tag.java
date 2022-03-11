package Tag.StandardTags.Text;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.H2;

public class H2Tag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public H2Tag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return H2.getName();
    }
}
