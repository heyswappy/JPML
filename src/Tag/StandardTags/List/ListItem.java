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

    public ListItem(Style styleData) {
        super(IS_VOID, styleData);
    }

    public ListItem(Style styleData, Map<String, Object> attributes) {
        super(IS_VOID, styleData, attributes);
    }

    @Override
    public String getTagName() {
        return LIST_ITEM.getName();
    }
}
