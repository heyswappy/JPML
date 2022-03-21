package Tag.StandardTags.Flows;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.ANCHOR;

public class AnchorTag extends AbstractHtmlTag<AnchorTag> {
    private static final Boolean IS_VOID = false;

    public AnchorTag() {
        super(IS_VOID);
    }

    public AnchorTag setDownload(String value) {
        this.addAttribute("download", value);
        return this;
    }

    public AnchorTag setHref(String value) {
        this.addAttribute("href", value);
        return this;
    }

    public AnchorTag setPing(String value) {
        this.addAttribute("ping", value);
        return this;
    }

    public AnchorTag setTarget(String target) {
        this.addAttribute("target", target);
        return this;
    }

    @Override
    public String getTagName() {
        return ANCHOR.getName();
    }
}
