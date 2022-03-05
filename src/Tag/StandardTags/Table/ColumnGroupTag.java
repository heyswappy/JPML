package Tag.StandardTags.Table;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.Map;

import static Tag.TagCentral.COLUMN_GROUP;

public class ColumnGroupTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public ColumnGroupTag() {
        super(IS_VOID);
    }

    public ColumnGroupTag(Style styleData) {
        super(IS_VOID, styleData);
    }

    public ColumnGroupTag(Style styleData, Map<String, Object> attributes) {
        super(IS_VOID, styleData, attributes);
    }

    public void setSpan(int span) {
        this.setAttribute("span", span);
    }

    @Override
    public String getTagName() {
        return COLUMN_GROUP.getName();
    }
}
