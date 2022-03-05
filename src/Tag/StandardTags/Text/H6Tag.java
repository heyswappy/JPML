package Tag.StandardTags.Text;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.Map;

import static Tag.TagCentral.H6;

public class H6Tag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public H6Tag() {
        super(IS_VOID);
    }

    public H6Tag(Style styleData) {
        super(IS_VOID, styleData);
    }

    public H6Tag(Style styleData, Map<String, Object> attributes) {
        super(IS_VOID, styleData, attributes);
    }

    @Override
    public String getTagName() {
        return H6.getName();
    }
}
