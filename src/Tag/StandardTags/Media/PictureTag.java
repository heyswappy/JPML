package Tag.StandardTags.Media;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.PICTURE;

public class PictureTag extends AbstractHtmlTag<PictureTag> {
    private static final Boolean IS_VOID = false;

    public PictureTag() {
        super(IS_VOID);
    }

    @Override
    public String getTagName() {
        return PICTURE.getName();
    }
}
