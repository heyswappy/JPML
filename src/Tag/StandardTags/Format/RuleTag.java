package Tag.StandardTags.Format;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.RULE;

public class RuleTag extends AbstractHtmlTag<RuleTag> {
    private static final Boolean IS_VOID = true;

    public RuleTag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return RULE.getName();
    }
}
