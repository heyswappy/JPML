package Document;

import DocumentData.AbstractDocumentData;
import Style.Style;
import Tag.HtmlTag;
import Template.DocumentTemplate;

import java.util.Map;

public interface WebDocument {

    public void insertData(String s);

    void appendTag(String tag);

    public void appendTag(String tag, Style styleData);

    public void appendTag(String tag, Style styleData, Map<String, Object> attributes);

    public void appendTag(HtmlTag tag);

    public <AbstractDocumentDataChild extends AbstractDocumentData> void appendComponent(
            DocumentTemplate<AbstractDocumentDataChild> document, AbstractDocumentDataChild data);

    void closeLatestTag();

    public void closeTag(HtmlTag tag);

    public String build();
}
