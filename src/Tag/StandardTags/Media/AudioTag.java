package Tag.StandardTags.Media;

import Tag.AbstractHtmlTag;

import static Tag.TagCentral.AUDIO;

public class AudioTag extends AbstractHtmlTag<AudioTag> {
    private static final Boolean IS_VOID = false;

    public AudioTag() {
        super(IS_VOID);
    }

    public AudioTag setAutoPlay(String value) {
        this.addAttribute("autoplay", value);
        return this;
    }

    public AudioTag setControls(String value) {
        this.addAttribute("controls", value);
        return this;
    }

    public AudioTag setLoop(String value) {
        this.addAttribute("loop", value);
        return this;
    }

    public AudioTag setMuted(String value) {
        this.addAttribute("muted", value);
        return this;
    }

    public AudioTag setPreload(String value) {
        this.addAttribute("preload", value);
        return this;
    }

    public AudioTag setSource(String value) {
        this.addAttribute("src", value);
        return this;
    }

    @Override
    public String getTagName() {
        return AUDIO.getName();
    }
}
