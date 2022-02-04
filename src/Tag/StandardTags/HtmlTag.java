package Tag.StandardTags;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.HashMap;
import java.util.Map;

import static Tag.TagCentral.HTML;

public class HtmlTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public HtmlTag() {
        super(IS_VOID);
    }

    public HtmlTag(Style styleData) {
        super(false, styleData);
    }

    public HtmlTag( Style styleData, Map<String, Object> attributes) {
        super(false, styleData, attributes);
    }

    @Override
    public String getTagName() {
        return HTML.getName();
    }
}
