package Tag.StandardTags.Table;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.Map;

import static Tag.TagCentral.TABLE_ROW;

public class TableRowTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public TableRowTag() {
        super(IS_VOID);
    }

    public TableRowTag(Style styleData) {
        super(IS_VOID, styleData);
    }

    public TableRowTag(Style styleData, Map<String, Object> attributes) {
        super(IS_VOID, styleData, attributes);
    }

    @Override
    public String getTagName() {
        return TABLE_ROW.getName();
    }
}
