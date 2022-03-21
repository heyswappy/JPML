package Tag.StandardTags.List;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.U_LIST;

public class UList extends AbstractHtmlTag<UList> {
    private static final Boolean IS_VOID = false;

    public UList() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return U_LIST.getName();
    }
}
