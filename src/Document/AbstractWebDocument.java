package Document;

import DocumentData.AbstractDocumentData;
import Style.Style;
import Tag.HtmlTag;
import Tag.TagFactory;
import Template.DocumentTemplate;

import java.util.Map;
import java.util.Stack;

import Exception.ExceptionUtils;

public abstract class AbstractWebDocument<ChildDocument extends AbstractWebDocument<?>>
        implements WebDocument<ChildDocument> {
    private static final WebDocumentSecurityToken securityToken = new WebDocumentSecurityToken();
    protected ChildDocument typecastedReference;
    StringBuilder document;
    Stack<HtmlTag> elementStack;

    AbstractWebDocument() {
        document = new StringBuilder();
        elementStack = new Stack<>();
        typecastedReference = (ChildDocument) this;
    }

    @Override
    public ChildDocument appendTag(String tag) {
        HtmlTag t = TagFactory.getTag(tag);
        appendTag(t);
        return typecastedReference;
    }

    @Override
    public ChildDocument appendTag(String tag, Style styleData) {
        HtmlTag t = TagFactory.getTag(tag, styleData);
        appendTag(t);
        return typecastedReference;
    }

    @Override
    public ChildDocument appendTag(String tag, Style styleData, Map<String, Object> attributes) {
        HtmlTag t = TagFactory.getTag(tag, styleData, attributes);
        appendTag(t);
        return typecastedReference;
    }

    @Override
    public ChildDocument appendTag(HtmlTag tag) {
        elementStack.push(tag);
        appendToDocument(tag.getStartTag(securityToken));
        return typecastedReference;
    }

    public <AbstractDocumentDataChild extends AbstractDocumentData> ChildDocument appendComponent(
            DocumentTemplate<AbstractDocumentDataChild> document, AbstractDocumentDataChild data) {
        String component = document.build(data).build();
        appendToDocument(component);
        return typecastedReference;
    }

    @Override
    public void closeTag() {
        closeTag(elementStack.peek());
    }

    @Override
    public void closeTag(int n) {
        while(n-- > 0) {
            closeTag(elementStack.peek());
        }
    }

    @Override
    public void closeTag(HtmlTag tag) {
        if(!elementStack.peek().getTagName().equals(tag.getTagName())) {
            throw ExceptionUtils.getWrongTagClosedException(elementStack.peek().getTagName(), tag.getTagName());
        }
        elementStack.pop();
        appendToDocument(tag.getEndTag(securityToken));
    }

    @Override
    public ChildDocument insertData(String s) {
        appendToDocument(s);
        return typecastedReference;
    }

    private void appendToDocument(String data) {
        document.append(data);
    }

    public static class WebDocumentSecurityToken {
        private WebDocumentSecurityToken() {}
    }
}
