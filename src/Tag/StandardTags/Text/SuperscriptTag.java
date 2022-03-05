package Tag.StandardTags.Text;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.Map;

import static Tag.TagCentral.SUPERSCRIPT;

public class SuperscriptTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public SuperscriptTag() {
        super(IS_VOID);
    }

    public SuperscriptTag(Style styleData) {
        super(IS_VOID, styleData);
    }

    public SuperscriptTag(Style styleData, Map<String, Object> attributes) {
        super(IS_VOID, styleData, attributes);
    }

    @Override
    public String getTagName() {
        return SUPERSCRIPT.getName();
    }
}
