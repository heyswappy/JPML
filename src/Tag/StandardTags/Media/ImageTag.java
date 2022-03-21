package Tag.StandardTags.Media;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.IMAGE;

public class ImageTag extends AbstractHtmlTag<ImageTag> {
    private static final Boolean IS_VOID = false;

    public ImageTag() {
        super(IS_VOID);
    }

    public ImageTag setAlternativeText(String url) {
        this.addAttribute("alt", url);
        return this;
    }

    public ImageTag setLoadingType(String value) {
        this.addAttribute("loading", value);
        return this;
    }

    public ImageTag setSource(String value) {
        this.addAttribute("src", value);
        return this;
    }

    public ImageTag setSourceSet(String value) {
        this.addAttribute("srcset", value);
        return this;
    }

    @Override
    public String getTagName() {
        return IMAGE.getName();
    }
}
