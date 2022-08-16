package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {

        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            map.put("q" + i, "w" + i);
        }
        map.put("q11", "w1");
        map.put("q112", "w1");
        map.put("q113", "w3");
        map.put("q114", "w17");
        map.put("q115", "w16");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {

        String name;
        int t;
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            name = pair.getValue();
            t = 0;
            for (Map.Entry<String, String> pair1 : copy.entrySet()) {
                if (pair1.getValue().equals(name)) {
                    t++;
                }
                if (t > 1) {
                    removeItemFromMapByValue(map, name);
                }
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}