package Tag.StandardTags.Form;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.OPTION;

public class OptionTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public OptionTag() {
        super(IS_VOID);
    }

    public void setLabel(String label) {
        this.addAttribute("label", label);
    }

    public void setDefaultValue(String selected) {
        this.addAttribute("selected", selected);
    }

    public void setValue(String value) {
        this.addAttribute("value", value);
    }

    @Override
    public String getTagName() {
        return OPTION.getName();
    }
}

