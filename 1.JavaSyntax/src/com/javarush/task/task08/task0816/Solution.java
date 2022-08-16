package com.javarush.task.task08.task0816;

import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            map.put("Stallone" + i, new Date("JUNE " + (i + 1) + " 1980"));
        }
        map.put("Stalloneoo", new Date("MAY 5 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();

            if ((pair.getValue().getMonth() >= 5) && (pair.getValue().getMonth() <= 7)) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}