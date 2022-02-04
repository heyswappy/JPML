package Tag;

import Document.AbstractWebDocument;

public interface HtmlTag extends Tag {

    public void setStyle(String style);

    public void addStyle(String key, String value);
}
