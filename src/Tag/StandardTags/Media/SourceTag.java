package Tag.StandardTags.Media;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.SOURCE;

public class SourceTag extends AbstractHtmlTag<SourceTag> {
    private static final Boolean IS_VOID = false;

    public SourceTag() {
        super(IS_VOID);
    }

    public SourceTag setSource(String value) {
        this.addAttribute("src", value);
        return this;
    }

    public SourceTag setSourceSet(String value) {
        this.addAttribute("srcset", value);
        return this;
    }

    public SourceTag setType(String type) {
        this.addAttribute("type", type);
        return this;
    }

    @Override
    public String getTagName() {
        return SOURCE.getName();
    }
}