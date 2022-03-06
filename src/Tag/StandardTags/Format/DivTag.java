package Tag.StandardTags.Format;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.Map;

import static Tag.TagCentral.DIV;

public class DivTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public DivTag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return DIV.getName();
    }
}
