package Document;

import Style.Style;
import Tag.HtmlTag;

import java.util.Map;

public interface WebDocument {

    public void insertData(String s);

    void appendTag(String tag);

    public void appendTag(String tag, Style styleData);

    public void appendTag(String tag, Style styleData, Map<String, Object> attributes);

    public void appendTag(HtmlTag tag);

    void closeLatestTag() throws Exception;

    public void closeTag(HtmlTag tag) throws Exception;

    public String build();
}
