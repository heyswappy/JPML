package Tag.StandardTags.Text;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.PARAGRAPH;

public class ParagraphTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public ParagraphTag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return PARAGRAPH.getName();
    }
}