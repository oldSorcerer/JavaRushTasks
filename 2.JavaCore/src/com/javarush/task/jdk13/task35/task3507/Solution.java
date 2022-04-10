package com.javarush.task.jdk13.task35.task3507;

import java.util.*;
import java.util.function.BiConsumer;

/* 
Collections & Generics
*/

public class Solution {

    public static void main(String[] args) {
    }

    public static <T> ArrayList<T> newArrayList(T... elements) {
        return new ArrayList<>(List.of(elements));
    }

    public static <T> HashSet<T> newHashSet(T... elements) {
        return  new HashSet<>(List.of(elements));
    }

    public static <K, V> HashMap<K, V> newHashMap(List<K> keys, List<V> values) {
        if (keys.size() < values.size() || keys.size() > values.size()) {
            throw new IllegalArgumentException();
        }

        HashMap<K, V> map = new HashMap<K, V>();



        return map;
    }
}
