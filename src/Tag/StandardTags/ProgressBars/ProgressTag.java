package Tag.StandardTags.ProgressBars;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.PROGRESS;

public class ProgressTag extends AbstractHtmlTag<ProgressTag> {
    private static final Boolean IS_VOID = false;

    public ProgressTag() {
        super(IS_VOID);
    }

    public ProgressTag setCurrentValue(String value) {
        this.addAttribute("value", value);
        return this;
    }

    public ProgressTag setMaximumValue(String value) {
        this.addAttribute("max", value);
        return this;
    }

    @Override
    public String getTagName() {
        return PROGRESS.getName();
    }
}
