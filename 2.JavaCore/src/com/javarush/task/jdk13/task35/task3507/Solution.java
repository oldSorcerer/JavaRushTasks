package com.javarush.task.jdk13.task35.task3507;

import java.util.*;

/* 
Collections & Generics
*/

public class Solution {

    public static void main(String[] args) {
        HashMap<Object, Number> map = newHashMap(newArrayList("first", "second"), newArrayList(1,2));
    }


    public static <T> ArrayList<T> newArrayList(T... elements) {
        return new ArrayList<>(List.of(elements));
    }

    public static <T> HashSet<T> newHashSet(T... elements) {
        return  new HashSet<>(List.of(elements));
    }

    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, List<? extends V> values) {

        HashMap<K, V> map = new HashMap<K, V>();

        if (keys.size() == values.size()) {
            for (int i = 0; i < keys.size(); i++) {
                map.put(keys.get(i), values.get(i));
            }
        } else {
            throw new IllegalArgumentException();
        }

        return map;
    }
}
