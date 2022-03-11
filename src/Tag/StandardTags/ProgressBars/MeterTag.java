package Tag.StandardTags.ProgressBars;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.METER;

public class MeterTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public MeterTag() {
        super(IS_VOID);
    }

    public void setCurrentValue(String value) {
        this.addAttribute("value", value);
    }

    public void setHighValue(String value) {
        this.addAttribute("high", value);
    }

    public void setLowValue(String value) {
        this.addAttribute("low", value);
    }

    public void setMinimumValue(String value) {
        this.addAttribute("min", value);
    }

    public void setMaximumValue(String value) {
        this.addAttribute("max", value);
    }

    public void setOptimumValue(String value) {
        this.addAttribute("optimum", value);
    }

    @Override
    public String getTagName() {
        return METER.getName();
    }
}
