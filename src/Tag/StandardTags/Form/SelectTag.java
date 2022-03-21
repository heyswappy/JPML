package Tag.StandardTags.Form;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.SELECT;

public class SelectTag extends AbstractHtmlTag<SelectTag> {
    private static final Boolean IS_VOID = false;

    public SelectTag() {
        super(IS_VOID);
    }

    public SelectTag setType(String type) {
        this.addAttribute("type", type);
        return this;
    }

    @Override
    public String getTagName() {
        return SELECT.getName();
    }
}
