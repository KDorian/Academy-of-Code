import java.util.HashMap;
import java.util.Map;

/**
 * Created by DK on 14.03.2017.
 */
public class Pairs<K, V> {

    private Map<K, V> pairs = new HashMap<K, V>();

    public void add(K k, V v){
         pairs.put(k, v);
    }

    public boolean check(K k) {
        return pairs.containsKey(k);
    }

    public int countElements(K k) {
        int count = 0;

        for (K key : pairs.keySet()) {
            if (key.equals(k))
                count++;
        }
        return count;
    }
}
