package Tag;

import Document.AbstractWebDocument;

public interface Tag {

    public String getTagName();

    public String getStartTag(AbstractWebDocument.WebDocumentSecurityToken token);

    public String getEndTag(AbstractWebDocument.WebDocumentSecurityToken token);

    public void setAttribute(String key, Object value);

    public String translateAttributes();


}
