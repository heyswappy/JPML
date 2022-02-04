package Style;

import Constants.JPMLConstants;
import Utils.CollectionUtils;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractStyle implements Style{

    private final Map<String, String> styleAttributes;

    public AbstractStyle() {
        this.styleAttributes = new HashMap<>();
    }

    public AbstractStyle(Map<String, String> styleAttributes) {
        this.styleAttributes = CollectionUtils.cloneMap(styleAttributes);
    }

    @Override
    public void addStyle(String key, String value) {
        styleAttributes.put(key, value);
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
