package Template;

import Document.WebDocument;
import DocumentData.AbstractDocumentData;

public interface DocumentTemplate <AbstractDocumentDataChild extends AbstractDocumentData> {

    public WebDocument build(WebDocument document, AbstractDocumentDataChild data);

    public WebDocument build(AbstractDocumentDataChild data);
}