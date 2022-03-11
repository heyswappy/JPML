package Tag.StandardTags.JavaScript;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.SCRIPT;

public class ScriptTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public ScriptTag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return SCRIPT.getName();
    }
}
