package com.javarush.task.task10.task1019;

/* 
Функциональности маловато!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();

        while (true) {
            String id = reader.readLine();
            if (id.isEmpty())
                break;
            String name = reader.readLine();
            map.put(name, Integer.parseInt(id));
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println( entry.getValue() + " " + entry.getKey());
        }

    }
}
