package Tag.StandardTags.ProgressBars;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.METER;

public class MeterTag extends AbstractHtmlTag<MeterTag> {
    private static final Boolean IS_VOID = false;

    public MeterTag() {
        super(IS_VOID);
    }

    public MeterTag setCurrentValue(String value) {
        this.addAttribute("value", value);
        return this;
    }

    public MeterTag setHighValue(String value) {
        this.addAttribute("high", value);
        return this;
    }

    public MeterTag setLowValue(String value) {
        this.addAttribute("low", value);
        return this;
    }

    public MeterTag setMinimumValue(String value) {
        this.addAttribute("min", value);
        return this;
    }

    public MeterTag setMaximumValue(String value) {
        this.addAttribute("max", value);
        return this;
    }

    public MeterTag setOptimumValue(String value) {
        this.addAttribute("optimum", value);
        return this;
    }

    @Override
    public String getTagName() {
        return METER.getName();
    }
}
