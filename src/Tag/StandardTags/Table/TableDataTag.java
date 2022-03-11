package Tag.StandardTags.Table;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.TABLE_DATA;

public class TableDataTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public TableDataTag() {
        super(IS_VOID);
    }

    public void setSpan(int row, int col) {
        this.addAttribute("rowspan", row);
        this.addAttribute("colspan", col);
    }

    @Override
    public String getTagName() {
        return TABLE_DATA.getName();
    }
}
