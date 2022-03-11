package Tag.StandardTags.Table;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.TABLE_ROW;

public class TableRowTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public TableRowTag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return TABLE_ROW.getName();
    }
}
