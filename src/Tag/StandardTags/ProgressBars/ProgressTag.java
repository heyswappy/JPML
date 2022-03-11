package Tag.StandardTags.ProgressBars;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.PROGRESS;

public class ProgressTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public ProgressTag() {
        super(IS_VOID);
    }

    public void setCurrentValue(String value) {
        this.addAttribute("value", value);
    }

    public void setMaximumValue(String value) {
        this.addAttribute("max", value);
    }

    @Override
    public String getTagName() {
        return PROGRESS.getName();
    }
}
