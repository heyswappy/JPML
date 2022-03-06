package Tag.StandardTags.List;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.Map;

import static Tag.TagCentral.LIST_ITEM;

public class ListItem extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public ListItem() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return LIST_ITEM.getName();
    }
}
