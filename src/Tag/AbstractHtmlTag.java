package Tag;

import Constants.JPMLConstants;
import Document.AbstractWebDocument;
import Style.Style;
import Style.ObjectStyle;
import Utils.CollectionUtils;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractHtmlTag<ChildTag extends AbstractHtmlTag<?>> implements HtmlTag<ChildTag> {
    protected ChildTag typecastedReference;
    private Map<String, Object> attributes;
    private Style styleData;
    private final boolean voidElement;

    public AbstractHtmlTag(boolean isVoidTag) {
        this.attributes = new HashMap<>();
        this.styleData = new ObjectStyle();
        this.voidElement = isVoidTag;
        typecastedReference = (ChildTag) this;
    }

    public ChildTag withAttributes(Map<String, Object> attributes) {
        this.setAttribute(attributes);
        return typecastedReference;
    }

    public ChildTag withStyle(Style style) {
        this.setStyle(style);
        return typecastedReference;
    }

    @Override
    public boolean isVoidTag() {
        return voidElement;
    }

    @Override
    public ChildTag setId(String id) {
        this.addAttribute("id", id);
        return typecastedReference;
    }

    @Override
    public ChildTag setName(String name) {
        this.addAttribute("name", name);
        return typecastedReference;
    }

    @Override
    public ChildTag setAttribute(Map<String, Object> attributes) {
        this.attributes = CollectionUtils.cloneMap(attributes);
        return typecastedReference;
    }

    @Override
    public ChildTag addAttribute(String key, Object value) {
        attributes.put(key, value);
        return typecastedReference;
    }

    @Override
    public ChildTag setStyle(Style style) {
        styleData = style;
        return typecastedReference;
    }

    @Override
    public ChildTag addStyle(String key, String value) {
        styleData.addStyle(key, value);
        return typecastedReference;
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
