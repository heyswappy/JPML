package Tag;

import Document.AbstractWebDocument;

public interface Tag {

    public String getTagName();

    public String translateAttributes();

    public String getStartTag(AbstractWebDocument.WebDocumentSecurityToken token);

    public String getEndTag(AbstractWebDocument.WebDocumentSecurityToken token);
}
