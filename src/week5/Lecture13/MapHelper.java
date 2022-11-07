package week5.Lecture13;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

public class MapHelper {
    // generic function
    /*
        return the value of the key if existed, else return null
     */
    public static <K, V> V get(Map61B<K, V> sim, K key){
        if (sim.containsKey(key)){
            return sim.get(key);
        }
        return null;
    }
    public static <X, Zerp> Zerp get(ArrayMap <X, Zerp> am , X key){
        if (am.containsKey(key)){
            return am.get(key);
        }
        return null;
    }
    public static <K extends Comparable<K>, V> K maxKey(Map61B<K,V> map){
        // K extends Comparable<K>使K实例化的对象能够比较，前提是K是可比较的数据类型
        // type upper bounds
        List<K> keylist = map.keys();
        K largest = keylist.get(0);
        for(K k : keylist){
            if (k.compareTo(largest) > 0){
                largest = k;
            }
        }
        return largest;
    }

    @Test
    public void testGet(){
        Map61B<String, Integer> m = new ArrayMap<String, Integer>();
        m.put("horse",3);
        m.put("fish", 9);
        m.put("house", 10);
        Integer actual = MapHelper.get(m, "fish");
        Integer expected = 9;
        assertEquals(expected, actual);
        Integer actual2 = MapHelper.get(m, "sss");
        assertEquals(null, actual2);
    }
}
