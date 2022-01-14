package Tag.StandardTags.Format;

import Tag.AbstractTag;

import java.util.HashMap;
import java.util.Map;

import static Tag.TagCentral.BREAK;

public class BreakTag extends AbstractTag {

    public BreakTag() {
        super(new HashMap<>(), true);
    }

    public BreakTag(Map<String, Object> attributes) {
        super(attributes, true);
    }

    @Override
    public String getTagName() {
        return BREAK.getName();
    }
}
