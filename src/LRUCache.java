
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache extends LinkedHashMap {
    private final int cacheSize;

    public LRUCache(int size) {
        super((int) Math.ceil((size / 0.75) + 1), 0.75f, true);
        cacheSize = size;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest){
        return size()>cacheSize;

    }
}
