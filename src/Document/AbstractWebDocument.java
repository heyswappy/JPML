package Document;

import Style.Style;
import Tag.HtmlTag;
import Tag.TagFactory;

import java.util.Map;
import java.util.Stack;

public abstract class AbstractWebDocument implements WebDocument {
    private static final WebDocumentSecurityToken securityToken = new WebDocumentSecurityToken();

    StringBuilder document;
    Stack<HtmlTag> elementStack;

    AbstractWebDocument() {
        document = new StringBuilder();
        elementStack = new Stack<>();
    }

    @Override
    public void appendTag(String tag) {
        HtmlTag t = TagFactory.getTag(tag);
        appendTag(t);
    }

    @Override
    public void appendTag(String tag, Style styleData) {
        HtmlTag t = TagFactory.getTag(tag, styleData);
        appendTag(t);
    }

    @Override
    public void appendTag(String tag, Style styleData, Map<String, Object> attributes) {
        HtmlTag t = TagFactory.getTag(tag, styleData, attributes);
        appendTag(t);
    }

    @Override
    public void appendTag(HtmlTag tag) {
        elementStack.push(tag);
        appendToDocument(tag.getStartTag(securityToken));
    }

    @Override
    public void closeLatestTag() throws Exception {
        closeTag(elementStack.peek());
    }

    @Override
    public void closeTag(HtmlTag tag) throws Exception {
        if(!elementStack.peek().getTagName().equals(tag.getTagName())) throw new Exception("Wrong tag closed");
        elementStack.pop();
        appendToDocument(tag.getEndTag(securityToken));
    }

    @Override
    public void insertData(String s) {
        appendToDocument(s);
    }

    private void appendToDocument(String data) {
        document.append(data);
    }

    public static class WebDocumentSecurityToken {
        private WebDocumentSecurityToken() {}
    }
}
