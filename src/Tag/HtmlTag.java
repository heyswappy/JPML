package Tag;

import Document.AbstractWebDocument;
import Style.Style;

import java.util.Map;

public interface HtmlTag extends Tag {

    public void setStyle(Style style);

    public void addStyle(String key, String value);
}
