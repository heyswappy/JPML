package Tag.StandardTags.Format;

import Tag.AbstractTag;

import java.util.HashMap;
import java.util.Map;

import static Tag.TagCentral.BREAK;
import static Tag.TagCentral.RULE;

public class RuleTag extends AbstractTag {

    public RuleTag() {
        super(new HashMap<>(), true);
    }

    public RuleTag(Map<String, Object> attributes) {
        super(attributes, true);
    }

    @Override
    public String getTagName() {
        return RULE.getName();
    }
}
