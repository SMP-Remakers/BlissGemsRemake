package com.hyperdondon.blissgemsremake.api.util;

import java.util.HashMap;
import java.util.Set;

public class VectorList<K, V1, V2> {
    public final HashMap<K, V1> VALUE_1_LIST = new HashMap<>();
    public final HashMap<K, V2> VALUE_2_LIST = new HashMap<>();

    public VectorList() {
    }

    public void add(K key, V1 value1, V2 value2) {
        VALUE_1_LIST.put(key, value1);
        VALUE_2_LIST.put(key, value2);
    }

    public void remove(K key) {
        VALUE_1_LIST.remove(key);
        VALUE_2_LIST.remove(key);
    }

    public V1 getValue1(K key) {
        return VALUE_1_LIST.get(key);
    }

    public V2 getValue2(K key) {
        return VALUE_2_LIST.get(key);
    }

    public void setValue1(K key, V1 value) {
        VALUE_1_LIST.replace(key, value);
    }

    public void setValue2(K key, V2 value) {
        VALUE_2_LIST.replace(key, value);
    }

    public boolean containsKey(K key) {
        return VALUE_1_LIST.containsKey(key);
    }

    public Set<K> keySet() {
        return VALUE_1_LIST.keySet();
    }
}
