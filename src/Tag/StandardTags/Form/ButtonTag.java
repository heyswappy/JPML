package Tag.StandardTags.Form;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.BUTTON;

public class ButtonTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public ButtonTag() {
        super(IS_VOID);
    }

    public void setType(String type) {
        this.addAttribute("type", type);
    }

    public void setValue(String value) {
        this.addAttribute("value", value);
    }

    @Override
    public String getTagName() {
        return BUTTON.getName();
    }
}
