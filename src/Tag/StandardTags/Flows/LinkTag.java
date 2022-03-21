package Tag.StandardTags.Flows;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.LINK;

public class LinkTag extends AbstractHtmlTag<LinkTag> {
    private static final Boolean IS_VOID = false;

    public LinkTag() {
        super(IS_VOID);
    }

    public LinkTag setHref(String value) {
        this.addAttribute("href", value);
        return this;
    }

    public LinkTag setResourceType(String type) {
        this.addAttribute("rel", type);
        return this;
    }

    @Override
    public String getTagName() {
        return LINK.getName();
    }
}
