package Tag.StandardTags.Text;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.Map;

import static Tag.TagCentral.H3;

public class H3Tag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public H3Tag() {
        super(IS_VOID);
    }

    public H3Tag(Style styleData) {
        super(IS_VOID, styleData);
    }

    public H3Tag(Style styleData, Map<String, Object> attributes) {
        super(IS_VOID, styleData, attributes);
    }

    @Override
    public String getTagName() {
        return H3.getName();
    }
}
