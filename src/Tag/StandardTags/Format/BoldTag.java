package Tag.StandardTags.Format;

import Tag.AbstractTag;

import java.util.HashMap;
import java.util.Map;

import static Tag.TagCentral.BOLD;

public class BoldTag extends AbstractTag {

    public BoldTag() {
        super(new HashMap<>(), false);
    }

    public BoldTag(Map<String, Object> attributes) {
        super(attributes, false);
    }

    @Override
    public String getTagName() {
        return BOLD.getName();
    }
}
