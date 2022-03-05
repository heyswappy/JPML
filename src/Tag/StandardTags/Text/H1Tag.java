package Tag.StandardTags.Text;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.Map;

import static Tag.TagCentral.H1;

public class H1Tag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public H1Tag() {
        super(IS_VOID);
    }

    public H1Tag(Style styleData) {
        super(IS_VOID, styleData);
    }

    public H1Tag(Style styleData, Map<String, Object> attributes) {
        super(IS_VOID, styleData, attributes);
    }

    @Override
    public String getTagName() {
        return H1.getName();
    }
}
