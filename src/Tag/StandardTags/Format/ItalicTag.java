package Tag.StandardTags.Format;

import Tag.AbstractTag;

import java.util.HashMap;
import java.util.Map;

import static Tag.TagCentral.ITALIC;

public class ItalicTag extends AbstractTag {

    public ItalicTag() {
        super(new HashMap<>(), false);
    }

    public ItalicTag(Map<String, Object> attributes) {
        super(attributes, false);
    }

    @Override
    public String getTagName() {
        return ITALIC.getName();
    }
}
