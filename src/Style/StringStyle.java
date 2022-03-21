package Style;

import Constants.JPMLConstants;

public class StringStyle implements Style<StringStyle> {

    private String styleData;

    public StringStyle(String style) {
        styleData = style;
    }

    @Override
    public StringStyle addStyle(String key, String value) {
        styleData += key +
                JPMLConstants.STYLE_COLON +
                value +
                JPMLConstants.STYLE_SEMICOLON;
        return this;
    }

    @Override
    public String build() {
        return styleData;
    }
}
