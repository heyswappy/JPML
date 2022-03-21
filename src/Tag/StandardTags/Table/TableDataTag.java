package Tag.StandardTags.Table;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.TABLE_DATA;

public class TableDataTag extends AbstractHtmlTag<TableDataTag> {
    private static final Boolean IS_VOID = false;

    public TableDataTag() {
        super(IS_VOID);
    }

    public TableDataTag setColSpan(int col) {
        this.addAttribute("colspan", col);
        return this;
    }

    public TableDataTag setRowSpan(int row) {
        this.addAttribute("rowspan", row);
        return this;
    }

    @Override
    public String getTagName() {
        return TABLE_DATA.getName();
    }
}
