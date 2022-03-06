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

    public void setSpan(int span) {
        this.addAttribute("span", span);
    }

    @Override
    public String getTagName() {
        return COLUMN_GROUP.getName();
    }
}
