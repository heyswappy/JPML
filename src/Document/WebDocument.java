package Document;

import DocumentData.AbstractDocumentData;
import Style.Style;
import Tag.HtmlTag;
import Template.DocumentTemplate;

import java.util.Map;

public interface WebDocument<ChildDocument extends WebDocument<?>> {

    public ChildDocument insertData(String s);

    public ChildDocument appendTag(String tag);

    public ChildDocument appendTag(String tag, Style styleData);

    public ChildDocument appendTag(String tag, Style styleData, Map<String, Object> attributes);

    public ChildDocument appendTag(HtmlTag tag);

    public <AbstractDocumentDataChild extends AbstractDocumentData> ChildDocument appendComponent(
            DocumentTemplate<AbstractDocumentDataChild> document, AbstractDocumentDataChild data);

    public void closeLatestTag();

    public void closeTag(HtmlTag tag);

    public String build();
}
