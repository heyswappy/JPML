package Tag.StandardTags.Form;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.FORM;

public class FormTag extends AbstractHtmlTag<FormTag> {
    private static final Boolean IS_VOID = false;

    public FormTag() {
        super(IS_VOID);
    }

    public FormTag setAction(String action) {
        this.addAttribute("action", action);
        return this;
    }

    public FormTag setMethod(String method) {
        this.addAttribute("method", method);
        return this;
    }

    public FormTag setTarget(String target) {
        this.addAttribute("target", target);
        return this;
    }

    @Override
    public String getTagName() {
        return FORM.getName();
    }
}
