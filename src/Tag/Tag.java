package Tag;

import Document.AbstractWebDocument;

import java.util.Map;

public interface Tag<ChildTag extends Tag<?>> {

    public boolean isVoidTag();

    public String getTagName();

    public String getStartTag(AbstractWebDocument.WebDocumentSecurityToken token);

    public String getEndTag(AbstractWebDocument.WebDocumentSecurityToken token);

    public ChildTag setAttribute(Map<String, Object> attributes);

    public ChildTag addAttribute(String key, Object value);

    public String translateAttributes();


}
