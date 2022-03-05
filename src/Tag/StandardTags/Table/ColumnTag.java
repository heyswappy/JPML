package Tag.StandardTags.Table;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.Map;

import static Tag.TagCentral.COLUMN;

public class ColumnTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public ColumnTag() {
        super(IS_VOID);
    }

    public ColumnTag(Style styleData) {
        super(IS_VOID, styleData);
    }

    public ColumnTag(Style styleData, Map<String, Object> attributes) {
        super(IS_VOID, styleData, attributes);
    }

    public void setSpan(int span) {
        this.setAttribute("span", span);
    }

    @Override
    public String getTagName() {
        return COLUMN.getName();
    }
}
