package Tag.StandardTags.Flows;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.LINK;

public class LinkTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public LinkTag() {
        super(IS_VOID);
    }

    public void setHref(String value) {
        this.addAttribute("href", value);
    }

    public void setResourceType(String type) {
        this.addAttribute("rel", type);
    }

    @Override
    public String getTagName() {
        return LINK.getName();
    }
}
