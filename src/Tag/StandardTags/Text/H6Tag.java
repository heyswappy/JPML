package Tag.StandardTags.Text;

import Style.Style;
import Tag.AbstractHtmlTag;

import java.util.Map;

import static Tag.TagCentral.H6;

public class H6Tag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public H6Tag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return H6.getName();
    }
}
