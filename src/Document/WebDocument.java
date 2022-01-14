package Document;

import Tag.Tag;

import java.util.Map;

public interface WebDocument {

    public void insertData(String s);

    public Tag appendTag(String tag, Map<String, Object> attributes);

    public void appendTag(Tag tag);

    void closeLatestTag() throws Exception;

    public void closeTag(Tag tag) throws Exception;

    public String build();
}
