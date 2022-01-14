package Document;

import Tag.Tag;
import Tag.TagFactory;

import java.util.Map;
import java.util.Stack;

public abstract class AbstractWebDocument implements WebDocument {
    private static final WebDocumentSecurityToken securityToken = new WebDocumentSecurityToken();

    StringBuilder document;
    Stack<Tag> elementStack;

    AbstractWebDocument() {
        document = new StringBuilder();
        elementStack = new Stack<>();
    }

    @Override
    public Tag appendTag(String tag, Map<String, Object> attributes) {
        Tag t = TagFactory.getTag(tag, attributes);
        appendTag(t);
        return t;
    }

    @Override
    public void appendTag(Tag tag) {
        elementStack.push(tag);
        appendToDocument(tag.getStartTag(securityToken));
    }

    @Override
    public void closeLatestTag() throws Exception {
        closeTag(elementStack.peek());
    }

    @Override
    public void closeTag(Tag tag) throws Exception {
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
