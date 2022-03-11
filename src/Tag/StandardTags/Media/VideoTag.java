package Tag.StandardTags.Media;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.VIDEO;

public class VideoTag extends AbstractHtmlTag {
    private static final Boolean IS_VOID = false;

    public VideoTag() {
        super(IS_VOID);
    }

    public void setAutoPlay(String value) {
        this.addAttribute("autoplay", value);
    }

    public void setControls(String value) {
        this.addAttribute("controls", value);
    }

    public void setLoop(String value) {
        this.addAttribute("loop", value);
    }

    public void setMuted(String value) {
        this.addAttribute("muted", value);
    }

    public void setPoster(String value) {
        this.addAttribute("poster", value);
    }

    public void setPreload(String value) {
        this.addAttribute("preload", value);
    }

    public void setSource(String value) {
        this.addAttribute("src", value);
    }

    @Override
    public String getTagName() {
        return VIDEO.getName();
    }
}
