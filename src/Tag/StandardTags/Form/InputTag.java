package Tag.StandardTags.Form;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.INPUT;

public class InputTag extends AbstractHtmlTag<InputTag> {
    private static final Boolean IS_VOID = false;

    public InputTag() {
        super(IS_VOID);
    }

    public InputTag setChecked(String value) {
        this.addAttribute("checked", value);
        return this;
    }

    public InputTag setDisabled(String disabled) {
        this.addAttribute("disabled", disabled);
        return this;
    }

    public InputTag setFormAssociation(String elementId) {
        this.addAttribute("form", elementId);
        return this;
    }

    public InputTag setMax(String value) {
        this.addAttribute("max", value);
        return this;
    }

    public InputTag setMaxLength(int value) {
        this.addAttribute("maxlength", value);
        return this;
    }

    public InputTag setMin(String value) {
        this.addAttribute("min", value);
        return this;
    }

    public InputTag setMinLength(int value) {
        this.addAttribute("minlength", value);
        return this;
    }

    public InputTag setReadonly(String value) {
        this.addAttribute("readonly", value);
        return this;
    }

    public InputTag setRequired(String value) {
        this.addAttribute("required", value);
        return this;
    }

    public InputTag setType(InputType type) {
        this.addAttribute("type", type);
        return this;
    }

    public InputTag setDefaultValue(String defaultValue) {
        this.addAttribute("value", defaultValue);
        return this;
    }

    @Override
    public String getTagName() {
        return INPUT.getName();
    }
}