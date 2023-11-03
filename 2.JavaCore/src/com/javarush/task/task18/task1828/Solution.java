package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        Map<String, String> map = new LinkedHashMap<>();

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = console.readLine();
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                while (reader.ready()) {
                    String string = reader.readLine();
                    String index = string.substring(0, 8).trim();
                    String substring = string.substring(8);
                    if (!map.containsKey(index)) {
                        map.put(index, substring);
                    }
                }
            }
            if (args.length != 0) {
                if (args[0].equals("-u")) {
                    String id = args[1].trim();
                    map.entrySet().stream().filter(pair -> id.equals(pair.getKey()))
                            .forEach(pair -> map.put(id, checkLength(args[2], 30) +
                                                         checkLength(args[3], 8) +
                                                         checkLength(args[4], 4)));
                } else if (args[0].equals("-d")) {
                    String id = args[1].trim();
                    map.entrySet().removeIf(pair -> pair.getKey().equals(id));
                }
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    writer.write(checkLength(entry.getKey(), 8) + entry.getValue());
                    writer.newLine();
                }
            }
        }
    }

    private static String checkLength(String string, int limit) {
        if (string.length() > limit) {
            return string.substring(0, limit);
        } else {
            return string + " ".repeat(limit - string.length());
//            StringBuilder builder = new StringBuilder(string);
//            while (builder.length() != limit) {
//                builder.append(" ");
//            }
//            return builder.toString();
        }
    }
}