package Tag.StandardTags.Flows;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.ANCHOR;

public class AnchorTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public AnchorTag() {
        super(IS_VOID);
    }

    public void setDownload(String value) {
        this.addAttribute("download", value);
    }

    public void setHref(String value) {
        this.addAttribute("href", value);
    }

    public void setPing(String value) {
        this.addAttribute("ping", value);
    }

    public void setTarget(String target) {
        this.addAttribute("target", target);
    }

    @Override
    public String getTagName() {
        return ANCHOR.getName();
    }
}
