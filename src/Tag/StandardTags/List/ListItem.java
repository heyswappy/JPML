package Tag.StandardTags.List;

import Tag.AbstractHtmlTag;;

import static Tag.TagCentral.LIST_ITEM;

public class ListItem extends AbstractHtmlTag<ListItem> {
    private static final Boolean IS_VOID = false;

    public ListItem() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return LIST_ITEM.getName();
    }
}
