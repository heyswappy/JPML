package Tag.StandardTags;


import Style.Style;
import Tag.AbstractHtmlTag;;

import java.util.HashMap;
import java.util.Map;

import static Tag.TagCentral.HEAD;


public class HeadTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public HeadTag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return HEAD.getName();
    }

}
