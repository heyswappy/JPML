package Tag.StandardTags.Form;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.INPUT;

public class InputTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public InputTag() {
        super(IS_VOID);
    }

    public void setChecked(String value) {
        this.addAttribute("checked", value);
    }
    public void setDisabled(String disabled) {
        this.addAttribute("disabled", disabled);
    }

    public void setFormAssociation(String elementId) {
        this.addAttribute("form", elementId);
    }

    public void setMax(String value) {
        this.addAttribute("max", value);
    }

    public void setMaxLength(int value) {
        this.addAttribute("maxlength", value);
    }

    public void setMin(String value) {
        this.addAttribute("min", value);
    }

    public void setMinLength(int value) {
        this.addAttribute("minlength", value);
    }

    public void setReadonly(String value) {
        this.addAttribute("readonly", value);
    }

    public void setRequired(String value) {
        this.addAttribute("required", value);
    }

    public void setType(InputType type) {
        this.addAttribute("type", type);
    }

    public void setDefaultValue(String defaultValue) {
        this.addAttribute("value", defaultValue);
    }

    @Override
    public String getTagName() {
        return INPUT.getName();
    }
}