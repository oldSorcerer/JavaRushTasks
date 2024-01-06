package com.javarush.task.task18.task1821;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<Character, Integer> map = new TreeMap<>();

        try (FileReader reader = new FileReader(args[0])) {
            while (reader.ready()) {
                char aChar = (char) reader.read();
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

        Files.readString(Path.of(args[0])).chars().boxed()
                .collect(Collectors.toMap(aChar -> (char) (aChar.intValue()), aChar -> 1, Integer::sum, TreeMap::new))
                .forEach((key, value) -> System.out.println(key + " " + value));
    }
}
