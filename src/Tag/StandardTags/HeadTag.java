package Tag.StandardTags;


import Tag.AbstractTag;;

import java.util.HashMap;
import java.util.Map;

import static Tag.TagCentral.HEAD;


public class HeadTag extends AbstractTag {

    public HeadTag() {
        super(new HashMap<>(), false);
    }

    public HeadTag(Map<String, Object> attributes) {
        super(attributes, false);
    }

    @Override
    public String getTagName() {
        return HEAD.getName();
    }

}
