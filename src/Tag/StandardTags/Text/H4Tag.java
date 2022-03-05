package Tag.StandardTags.Text;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.Map;

import static Tag.TagCentral.H4;

public class H4Tag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public H4Tag() {
        super(IS_VOID);
    }

    public H4Tag(Style styleData) {
        super(IS_VOID, styleData);
    }

    public H4Tag(Style styleData, Map<String, Object> attributes) {
        super(IS_VOID, styleData, attributes);
    }

    @Override
    public String getTagName() {
        return H4.getName();
    }
}
