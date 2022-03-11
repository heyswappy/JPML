package Tag.StandardTags;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.HTML;

public class HtmlTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public HtmlTag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return HTML.getName();
    }
}
