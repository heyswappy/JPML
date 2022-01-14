package Tag.StandardTags;

import Tag.AbstractTag;

import java.util.HashMap;
import java.util.Map;

import static Tag.TagCentral.BODY;

public class BodyTag extends AbstractTag {

    public BodyTag() {
        super(new HashMap<>(), false);
    }

    public BodyTag(Map<String, Object> attributes) {
        super(attributes, false);
    }

    @Override
    public String getTagName() {
        return BODY.getName();
    }
}
