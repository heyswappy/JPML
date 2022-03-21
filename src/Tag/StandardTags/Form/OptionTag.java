package Tag.StandardTags.Form;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.OPTION;

public class OptionTag extends AbstractHtmlTag<OptionTag> {
    private static final Boolean IS_VOID = false;

    public OptionTag() {
        super(IS_VOID);
    }

    public OptionTag setLabel(String label) {
        this.addAttribute("label", label);
        return this;
    }

    public OptionTag setDefaultValue(String selected) {
        this.addAttribute("selected", selected);
        return this;
    }

    public OptionTag setValue(String value) {
        this.addAttribute("value", value);
        return this;
    }

    @Override
    public String getTagName() {
        return OPTION.getName();
    }
}

