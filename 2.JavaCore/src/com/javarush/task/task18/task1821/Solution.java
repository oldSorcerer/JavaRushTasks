package com.javarush.task.task18.task1821;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<Character, Integer> map = new TreeMap<>();

        try (FileInputStream inputStream = new FileInputStream(args[0])) {
            while (inputStream.available() > 0) {
                char aChar = (char) inputStream.read();
                if (!map.containsKey(aChar)) {
                    map.put(aChar, 1);
                } else {
                    map.put(aChar, map.get(aChar) + 1);
                } //    map.merge(aChar, 1, Integer::sum);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
