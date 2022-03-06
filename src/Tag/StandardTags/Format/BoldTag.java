package Tag.StandardTags.Format;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.HashMap;
import java.util.Map;

import static Tag.TagCentral.BOLD;

public class BoldTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public BoldTag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return BOLD.getName();
    }
}
