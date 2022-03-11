package Tag.StandardTags.Text;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.SUPERSCRIPT;

public class SuperscriptTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public SuperscriptTag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return SUPERSCRIPT.getName();
    }
}
