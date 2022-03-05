package Tag.StandardTags.Text;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.Map;

import static Tag.TagCentral.H5;

public class H5Tag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public H5Tag() {
        super(IS_VOID);
    }

    public H5Tag(Style styleData) {
        super(IS_VOID, styleData);
    }

    public H5Tag(Style styleData, Map<String, Object> attributes) {
        super(IS_VOID, styleData, attributes);
    }

    @Override
    public String getTagName() {
        return H5.getName();
    }
}
