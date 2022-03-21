package Tag.StandardTags.Table;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.TABLE_HEADER;

public class TableHeaderTag extends AbstractHtmlTag<TableHeaderTag> {
    private static final Boolean IS_VOID = false;

    public TableHeaderTag() {
        super(IS_VOID);
    }

    public TableHeaderTag setColSpan(int col) {
        this.addAttribute("colspan", col);
        return this;
    }

    public TableHeaderTag setRowSpan(int row) {
        this.addAttribute("rowspan", row);
        return this;
    }

    @Override
    public String getTagName() {
        return TABLE_HEADER.getName();
    }
}
