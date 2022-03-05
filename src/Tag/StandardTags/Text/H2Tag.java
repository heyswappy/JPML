package Tag.StandardTags.Text;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.Map;

import static Tag.TagCentral.H2;

public class H2Tag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public H2Tag() {
        super(IS_VOID);
    }

    public H2Tag(Style styleData) {
        super(IS_VOID, styleData);
    }

    public H2Tag(Style styleData, Map<String, Object> attributes) {
        super(IS_VOID, styleData, attributes);
    }

    @Override
    public String getTagName() {
        return H2.getName();
    }
}
