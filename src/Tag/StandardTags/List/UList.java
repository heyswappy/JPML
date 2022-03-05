package Tag.StandardTags.List;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.Map;

import static Tag.TagCentral.U_LIST;

public class UList extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public UList() {
        super(IS_VOID);
    }

    public UList(Style styleData) {
        super(IS_VOID, styleData);
    }

    public UList(Style styleData, Map<String, Object> attributes) {
        super(IS_VOID, styleData, attributes);
    }

    @Override
    public String getTagName() {
        return U_LIST.getName();
    }
}
