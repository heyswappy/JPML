package Tag.StandardTags.Form;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.LABEL;

public class LabelTag extends AbstractHtmlTag<LabelTag> {
    private static final Boolean IS_VOID = false;

    public LabelTag() {
        super(IS_VOID);
    }

    public LabelTag setElementAssociation(String elementId) {
        this.addAttribute("for", elementId);
        return this;
    }

    public LabelTag setFormAssociation(String elementId) {
        this.addAttribute("form", elementId);
        return this;
    }

    @Override
    public String getTagName() {
        return LABEL.getName();
    }
}
