package Tag;

import Constants.JPMLConstants;
import Document.AbstractWebDocument;
import Style.Style;
import Style.ConcreteStyle;
import Utils.CollectionUtils;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractHtmlTag implements HtmlTag {
    private Map<String, Object> attributes;
    private final Style styleData;
    private final boolean voidElement;

    public AbstractHtmlTag(boolean isVoidTag) {
        this.attributes = new HashMap<>();
        this.styleData = new ConcreteStyle();
        this.voidElement = isVoidTag;
    }

    public AbstractHtmlTag(boolean isVoidTag, Style styleData) {
        this.attributes = new HashMap<>();
        this.styleData = styleData;
        this.voidElement = isVoidTag;
    }

    public AbstractHtmlTag(boolean isVoidTag, Style styleData, Map<String, Object> attributes) {
        this.attributes = CollectionUtils.cloneMap(attributes);
        this.styleData = styleData;
        this.voidElement = isVoidTag;
    }

    @Override
    public void setAttribute(String key, Object value) {
        attributes.put(key, value);
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = CollectionUtils.cloneMap(attributes);
    }

    @Override
    public void setStyle(String value) {
        setAttribute(JPMLConstants.STYLE_ATTRIBUTE, value);
    }

    @Override
    public void addStyle(String key, String value) {
        styleData.addStyle(key, value);
    }

    @Override
    public String translateAttributes() {
        mergeStyles();
        final StringBuilder sb = new StringBuilder();
        attributes.forEach((key, value) -> {
            String keyVal = JPMLConstants.TAG_SPACE + // adding space first is important!
                    key +
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

    private void mergeStyles() {
        String mergedStyle = attributes.getOrDefault(JPMLConstants.STYLE_ATTRIBUTE, JPMLConstants.EMPTY_STRING).toString();
        mergedStyle += styleData.build();
        if(!mergedStyle.isBlank()) {
            attributes.put(JPMLConstants.STYLE_ATTRIBUTE, mergedStyle);
        }
    }
}
