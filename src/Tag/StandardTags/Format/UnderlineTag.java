package Tag.StandardTags.Format;

import Tag.AbstractTag;

import java.util.HashMap;
import java.util.Map;

import static Tag.TagCentral.UNDERLINE;

public class UnderlineTag extends AbstractTag {

    public UnderlineTag() {
        super(new HashMap<>(), false);
    }

    public UnderlineTag(Map<String, Object> attributes) {
        super(attributes, false);
    }

    @Override
    public String getTagName() {
        return UNDERLINE.getName();
    }
}
