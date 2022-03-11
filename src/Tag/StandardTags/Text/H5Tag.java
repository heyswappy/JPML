package Tag.StandardTags.Text;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.H5;

public class H5Tag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public H5Tag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return H5.getName();
    }
}
