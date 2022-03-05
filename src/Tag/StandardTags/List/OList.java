package Tag.StandardTags.List;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.Map;

import static Tag.TagCentral.O_LIST;

public class OList extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public OList() {
        super(IS_VOID);
    }

    public OList(Style styleData) {
        super(IS_VOID, styleData);
    }

    public OList(Style styleData, Map<String, Object> attributes) {
        super(IS_VOID, styleData, attributes);
    }

    public void setType(String type) {
        this.setAttribute("type", type);
    }

    @Override
    public String getTagName() {
        return O_LIST.getName();
    }
}
