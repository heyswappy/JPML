package Tag.StandardTags.Form;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.TEXT_AREA;

public class TextAreaTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public TextAreaTag() {
        super(IS_VOID);
    }

    public void setMaxLength(String length) {
        this.addAttribute("maxlength", length);
    }

    public void setRows(String rows) {
        this.addAttribute("rows", rows);
    }

    public void setWrap(String type) {
        this.addAttribute("wrap", type);
    }

    @Override
    public String getTagName() {
        return TEXT_AREA.getName();
    }
}
