package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(Integer.toString(i), new Cat(Integer.toString(i)));
        }
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        HashSet<Cat> set = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            set.add(pair.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private final String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}