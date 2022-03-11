package Tag.StandardTags.Form;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.SELECT;

public class SelectTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public SelectTag() {
        super(IS_VOID);
    }

    public void setType(String type) {
        this.addAttribute("type", type);
    }

    @Override
    public String getTagName() {
        return SELECT.getName();
    }
}
