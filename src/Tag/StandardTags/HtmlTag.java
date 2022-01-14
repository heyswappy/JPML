package Tag.StandardTags;

import Tag.AbstractTag;

import java.util.HashMap;
import java.util.Map;

import static Tag.TagCentral.HTML;

public class HtmlTag extends AbstractTag {

    public HtmlTag() {
        super(new HashMap<>(), false);
    }

    public HtmlTag(Map<String, Object> attributes) {
        super(attributes, false);
    }

    @Override
    public String getTagName() {
        return HTML.getName();
    }
}
