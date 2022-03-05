package Tag.StandardTags.Table;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.Map;

import static Tag.TagCentral.TABLE_HEADER;

public class TableHeaderTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public TableHeaderTag() {
        super(IS_VOID);
    }

    public TableHeaderTag(Style styleData) {
        super(IS_VOID, styleData);
    }

    public TableHeaderTag(Style styleData, Map<String, Object> attributes) {
        super(IS_VOID, styleData, attributes);
    }

    public void setSpan(int row, int col) {
        this.setAttribute("rowspan", row);
        this.setAttribute("colspan", col);
    }

    @Override
    public String getTagName() {
        return TABLE_HEADER.getName();
    }
}
