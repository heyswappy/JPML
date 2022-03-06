package Tag.StandardTags.Format;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.HashMap;
import java.util.Map;

import static Tag.TagCentral.BREAK;

public class BreakTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = true;

    public BreakTag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return BREAK.getName();
    }
}
