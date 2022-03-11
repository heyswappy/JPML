package Tag;

import Style.Style;

public interface HtmlTag extends Tag {

    public void setId(String id);

    public void setName(String name);

    public void setStyle(Style style);

    public void addStyle(String key, String value);
}
