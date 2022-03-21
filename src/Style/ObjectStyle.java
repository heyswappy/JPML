package Style;

import Constants.JPMLConstants;
import Utils.CollectionUtils;

import java.util.HashMap;
import java.util.Map;

public class ObjectStyle implements Style<ObjectStyle> {

    private final Map<String, String> styleAttributes;

    public ObjectStyle() {
        this.styleAttributes = new HashMap<>();
    }

    public ObjectStyle(Map<String, String> styleAttributes) {
        this.styleAttributes = CollectionUtils.cloneMap(styleAttributes);
    }

    @Override
    public ObjectStyle addStyle(String key, String value) {
        styleAttributes.put(key, value);
        return this;
    }

    @Override
    public String build() {
        StringBuilder sb = new StringBuilder();
        styleAttributes.forEach((key, value) -> {
            String keyVal = key +
                    JPMLConstants.STYLE_COLON +
                    value +
                    JPMLConstants.STYLE_SEMICOLON;
            sb.append(keyVal);
        });
        if(sb.length() > JPMLConstants.ZERO) {
            return sb.toString();
        }
        return JPMLConstants.EMPTY_STRING;
    }
}
