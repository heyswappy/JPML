package Tag.StandardTags.Form;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.FORM;

public class FormTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public FormTag() {
        super(IS_VOID);
    }

    public void setAction(String action) {
        this.addAttribute("action", action);
    }

    public void setMethod(String method) {
        this.addAttribute("method", method);
    }

    public void setTarget(String target) {
        this.addAttribute("target", target);
    }

    @Override
    public String getTagName() {
        return FORM.getName();
    }
}
