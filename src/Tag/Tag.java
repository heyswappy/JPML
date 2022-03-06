package Tag;

import Document.AbstractWebDocument;

import java.util.Map;

public interface Tag {

    public String getTagName();

    public String getStartTag(AbstractWebDocument.WebDocumentSecurityToken token);

    public String getEndTag(AbstractWebDocument.WebDocumentSecurityToken token);

    public void setAttribute(Map<String, Object> attributes);

    public void addAttribute(String key, Object value);

    public String translateAttributes();


}
