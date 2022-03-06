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

    public void setType(String type) {
        this.addAttribute("type", type);
    }

    @Override
    public String getTagName() {
        return O_LIST.getName();
    }
}
