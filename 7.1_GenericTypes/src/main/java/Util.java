import java.util.Collection;

/**
 * Created by DK on 14.03.2017.
 */
public class Util {

    public static<K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&p1.getValue().equals(p2.getValue());
    }

    public static<T> void fromArrayToCollection(T[] t, Collection<T> col) {
        for(T el : t) {
            col.add(el);
        }
    }
}
