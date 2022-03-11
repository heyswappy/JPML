package Tag.StandardTags.Table;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.TABLE;

public class TableTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public TableTag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return TABLE.getName();
    }
}
