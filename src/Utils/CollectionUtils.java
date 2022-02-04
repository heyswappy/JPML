package Utils;

import java.util.Map;
import java.util.stream.Collectors;

public class CollectionUtils {

    public static <K, V> Map<K, V> cloneMap(Map<K, V> srcMap) {
        return srcMap.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
