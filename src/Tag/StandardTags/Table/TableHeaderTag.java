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

    public void setSpan(int row, int col) {
        this.addAttribute("rowspan", row);
        this.addAttribute("colspan", col);
    }

    @Override
    public String getTagName() {
        return TABLE_HEADER.getName();
    }
}
