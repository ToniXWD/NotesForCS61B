package week5.Lecture13;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class ArrayMap<K,V> implements Map61B<K, V>, Iterable<K> {
    // implements Iterable makes the class capable to be iterated
    private K[] keys;
    private V[] values;
    private int size;

    public class KeyIterator implements Iterator<K> {
        private int wizardPosition;
        public KeyIterator(){
            wizardPosition = 0;
        }
        public boolean hasNext(){
            return wizardPosition < size;
        }
        public K next(){
            K returnVal = keys[wizardPosition];
            wizardPosition++;
            return returnVal;
        }
    }

    public  Iterator<K> iterator(){
        // iterator() method must return an object that implements the iterator interface.
        return new KeyIterator();
    }

    public ArrayMap(){
        keys = (K[]) new Object[100];
        values = (V[]) new Object[100];
        size = 0;
    }

    private int keyIndex(K key){
        for (int i = 0; i < size; i++){
            if (keys[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean containsKey(K key) {
        int index = keyIndex(key);
        return index > -1;
    }

    @Override
    public void put(K key, V value) {
        int index = keyIndex(key);
        if (index == -1){
            keys[size] = key;
            values[size] = value;
            size++;
        } else {
            values[index] = value;
        }
    }

    @Override
    public V get(K key) {
        int index = keyIndex(key);
        if (index == -1) {
            throw new IllegalArgumentException("The key provided "+key+" was not in ArrayMap");
        }
        return values[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public List<K> keys() {
        List<K> keylist = new ArrayList<>();
//        for (int i = 0; i < keys.length; i++){
//            keylist.add(keys[i]);
//        }
//        better writing
        Collections.addAll(keylist, keys);
        return keylist;
    }

    @Test
    public void test(){
        ArrayMap<Integer, Integer> am = new ArrayMap<>();
        am.put(2,5);
        int expeced = 5;
        assertEquals((Integer) expeced, am.get(2));
    }

    public static void main(String[] args) {
        ArrayMap<String, Integer> m = new ArrayMap<String, Integer>();
        m.put("toni", 100);
        m.put("tom", 95);
        m.put("sam", 90);
    }
}
