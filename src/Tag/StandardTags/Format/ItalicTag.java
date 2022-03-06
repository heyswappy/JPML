package Tag.StandardTags.Format;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.HashMap;
import java.util.Map;

import static Tag.TagCentral.ITALIC;

public class ItalicTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public ItalicTag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return ITALIC.getName();
    }
}
