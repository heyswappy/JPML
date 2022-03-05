package Tag.StandardTags.Table;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.Map;

import static Tag.TagCentral.TABLE_DATA;

public class TableDataTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public TableDataTag() {
        super(IS_VOID);
    }

    public TableDataTag(Style styleData) {
        super(IS_VOID, styleData);
    }

    public TableDataTag(Style styleData, Map<String, Object> attributes) {
        super(IS_VOID, styleData, attributes);
    }

    public void setSpan(int row, int col) {
        this.setAttribute("rowspan", row);
        this.setAttribute("colspan", col);
    }

    @Override
    public String getTagName() {
        return TABLE_DATA.getName();
    }
}
