package Tag.StandardTags.Media;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.SOURCE;

public class SourceTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public SourceTag() {
        super(IS_VOID);
    }

    public void setSource(String value) {
        this.addAttribute("src", value);
    }

    public void setSourceSet(String value) {
        this.addAttribute("srcset", value);
    }

    public void setType(String type) {
        this.addAttribute("type", type);
    }

    @Override
    public String getTagName() {
        return SOURCE.getName();
    }
}