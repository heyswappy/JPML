package Tag.StandardTags.Form;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.LABEL;

public class LabelTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public LabelTag() {
        super(IS_VOID);
    }

    public void setElementAssociation(String elementId) {
        this.addAttribute("for", elementId);
    }

    public void setFormAssociation(String elementId) {
        this.addAttribute("form", elementId);
    }

    @Override
    public String getTagName() {
        return LABEL.getName();
    }
}
