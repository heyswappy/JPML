package Tag;

import Constants.JPMLConstants;
import Document.AbstractWebDocument;

import java.util.Map;

public abstract class AbstractTag implements Tag {
    private Map<String, Object> attributes;
    protected boolean voidElement;

    public AbstractTag(Map<String, Object> attributes, boolean isVoidTag) {
        this.attributes = attributes;
        this.voidElement = isVoidTag;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    public Map<String, Object> getAttributes(Map<String, Object> attributes) {
        return attributes;
    }

    @Override
    public String translateAttributes() {
        final StringBuilder sb = new StringBuilder();
        attributes.forEach((key, value) -> {
            String keyVal = key +
                    JPMLConstants.TAG_SPACE + // adding space first is important!
                    JPMLConstants.TAG_ATTRIBUTE_ASSIGN +
                    JPMLConstants.TAG_QUOTE +
                    value.toString() +
                    JPMLConstants.TAG_QUOTE;
            sb.append(keyVal);
        });
        return sb.toString();
    }

    @Override
    public String getStartTag(AbstractWebDocument.WebDocumentSecurityToken token) {
        return JPMLConstants.TAG_BRACKET_START +
                getTagName() +
                translateAttributes() +
                (voidElement
                    ? JPMLConstants.TAG_SLASH
                    : JPMLConstants.EMPTY_STRING
                ) +
                JPMLConstants.TAG_BRACKET_END;
    }

    @Override
    public String getEndTag(AbstractWebDocument.WebDocumentSecurityToken token) {
        return voidElement
                ? JPMLConstants.EMPTY_STRING
                : JPMLConstants.TAG_BRACKET_START +
                  JPMLConstants.TAG_SLASH +
                  getTagName() +
                  JPMLConstants.TAG_BRACKET_END;
    }
}
