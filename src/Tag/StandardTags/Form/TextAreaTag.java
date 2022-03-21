package Tag.StandardTags.Form;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.TEXT_AREA;

public class TextAreaTag extends AbstractHtmlTag<TextAreaTag> {
    private static final Boolean IS_VOID = false;

    public TextAreaTag() {
        super(IS_VOID);
    }

    public TextAreaTag setMaxLength(String length) {
        this.addAttribute("maxlength", length);
        return this;
    }

    public TextAreaTag setRows(String rows) {
        this.addAttribute("rows", rows);
        return this;
    }

    public TextAreaTag setWrap(String type) {
        this.addAttribute("wrap", type);
        return this;
    }

    @Override
    public String getTagName() {
        return TEXT_AREA.getName();
    }
}
