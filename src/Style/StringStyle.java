package Style;

import Constants.JPMLConstants;

public class StringStyle implements Style {

    private String styleData;

    public StringStyle(String style) {
        styleData = style;
    }

    @Override
    public void addStyle(String key, String value) {
        styleData += key +
                JPMLConstants.STYLE_COLON +
                value +
                JPMLConstants.STYLE_SEMICOLON;
    }

    @Override
    public String build() {
        return styleData;
    }
}
