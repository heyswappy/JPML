package Tag.StandardTags.Format;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.HashMap;
import java.util.Map;

import static Tag.TagCentral.RULE;

public class RuleTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = true;

    public RuleTag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return RULE.getName();
    }
}
