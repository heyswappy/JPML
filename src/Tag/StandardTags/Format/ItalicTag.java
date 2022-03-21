package Tag.StandardTags.Format;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.ITALIC;

public class ItalicTag extends AbstractHtmlTag<ItalicTag> {
    private static final Boolean IS_VOID = false;

    public ItalicTag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return ITALIC.getName();
    }
}
