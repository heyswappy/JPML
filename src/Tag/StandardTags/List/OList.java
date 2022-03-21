package Tag.StandardTags.List;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.O_LIST;

public class OList extends AbstractHtmlTag<OList> {
    private static final Boolean IS_VOID = false;

    public OList() {
        super(IS_VOID);
    }

    public OList setType(String type) {
        this.addAttribute("type", type);
        return this;
    }

    @Override
    public String getTagName() {
        return O_LIST.getName();
    }
}
