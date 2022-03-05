package Tag.StandardTags.Text;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.Map;

import static Tag.TagCentral.PARAGRAPH;

public class ParagraphTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public ParagraphTag() {
        super(IS_VOID);
    }

    public ParagraphTag(Style styleData) {
        super(IS_VOID, styleData);
    }

    public ParagraphTag(Style styleData, Map<String, Object> attributes) {
        super(IS_VOID, styleData, attributes);
    }

    @Override
    public String getTagName() {
        return PARAGRAPH.getName();
    }
}