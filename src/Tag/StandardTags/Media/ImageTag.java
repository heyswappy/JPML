package Tag.StandardTags.Media;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.IMAGE;

public class ImageTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public ImageTag() {
        super(IS_VOID);
    }

    public void setAlternativeText(String url) {
        this.addAttribute("alt", url);
    }

    public void setLoadingType(String value) {
        this.addAttribute("loading", value);
    }

    public void setSource(String value) {
        this.addAttribute("src", value);
    }

    public void setSourceSet(String value) {
        this.addAttribute("srcset", value);
    }

    @Override
    public String getTagName() {
        return IMAGE.getName();
    }
}
