package Tag.StandardTags.Form;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.BUTTON;

public class ButtonTag extends AbstractHtmlTag<ButtonTag> {
    private static final Boolean IS_VOID = false;

    public ButtonTag() {
        super(IS_VOID);
    }

    public ButtonTag setType(String type) {
        this.addAttribute("type", type);
        return this;
    }

    public ButtonTag setValue(String value) {
        this.addAttribute("value", value);
        return this;
    }

    @Override
    public String getTagName() {
        return BUTTON.getName();
    }
}
