package Tag.StandardTags.Media;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.VIDEO;

public class VideoTag extends AbstractHtmlTag<VideoTag> {
    private static final Boolean IS_VOID = false;

    public VideoTag() {
        super(IS_VOID);
    }

    public VideoTag setAutoPlay(String value) {
        this.addAttribute("autoplay", value);
        return this;
    }

    public VideoTag setControls(String value) {
        this.addAttribute("controls", value);
        return this;
    }

    public VideoTag setLoop(String value) {
        this.addAttribute("loop", value);
        return this;
    }

    public VideoTag setMuted(String value) {
        this.addAttribute("muted", value);
        return this;
    }

    public VideoTag setPoster(String value) {
        this.addAttribute("poster", value);
        return this;
    }

    public VideoTag setPreload(String value) {
        this.addAttribute("preload", value);
        return this;
    }

    public VideoTag setSource(String value) {
        this.addAttribute("src", value);
        return this;
    }

    @Override
    public String getTagName() {
        return VIDEO.getName();
    }
}
