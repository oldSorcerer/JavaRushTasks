package com.javarush.task.task36.task3610;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

public class MyMultiMap<K, V> extends HashMap<K, V> implements Cloneable, Serializable {

    static final long serialVersionUID = 123456789L;
    private HashMap<K, List<V>> map;
    private final int repeatCount;

    public MyMultiMap(int repeatCount) {
        this.repeatCount = repeatCount;
        map = new HashMap<>();
    }

    @Override
    public int size() {
//        int size = 0;
//        for (List<V> value : map.values()) {
//            size += value.size();
//        }
//        return size;
        return map.values().stream().mapToInt(List::size).sum();
    }

    @Override
    public V put(K key, V value) {

        if (map.containsKey(key)) {
            if (map.get(key).size() < repeatCount) {
                List<V> list = map.get(key);
                list.add(value);
                return list.get(list.size() - 2);
            } else {
                List<V> list = map.get(key);
                list.remove(0);
                list.add(value);
                return list.get(list.size() - 2);
            }
        } else {
            map.put(key, new ArrayList<>(Arrays.asList(value)));
            return null;
        }
    }

    @Override
    public V remove(Object key) {

        if (map.containsKey(key)) {
            List<V> list = map.get(key);
            V remove = list.remove(0);
            if (list.isEmpty()) {
                map.remove(key);
            }
            return remove;
        } else {
            return null;
        }
    }

    @Override
    public Set<K> keySet() {
        return map.keySet();
    }

    @Override
    public Collection<V> values() {
        return map.values().stream().flatMap(Collection::stream).collect(Collectors.toList());
    }

    @Override
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
//        for (Entry<K, List<V>> entry : map.entrySet()) {
//            for (V element : entry.getValue()) {
//                if (element.equals(value)) {
//                    return true;
//                }
//            }
//        }
//        return false;

        return map.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .anyMatch(element -> element.equals(value));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (Map.Entry<K, List<V>> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            for (V v : entry.getValue()) {
                sb.append(v);
                sb.append(", ");
            }
        }
        String substring = sb.substring(0, sb.length() - 2);
        return substring + "}";
    }
}