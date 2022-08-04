package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/*
Только для богачей
*/

public class Solution {

    public static HashMap<String, Integer> createMap() {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("name01", 100);
        map.put("name02", 200);
        map.put("name03", 300);
        map.put("name04", 400);
        map.put("name05", 500);
        map.put("name06", 600);
        map.put("name07", 700);
        map.put("name08", 800);
        map.put("name09", 900);
        map.put("name10", 1000);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {

        HashMap<String, Integer> copy = new HashMap<>(map);

        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = createMap();
        removeItemFromMap(map);
        System.out.println(map);
    }
}