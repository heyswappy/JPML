package Tag;

import Style.Style;

public interface HtmlTag<ChildTag extends HtmlTag<?>> extends Tag<ChildTag> {

    public ChildTag setId(String id);

    public ChildTag setName(String name);

    public ChildTag setStyle(Style style);

    public ChildTag addStyle(String key, String value);

    public ChildTag setClass(String className);
}
