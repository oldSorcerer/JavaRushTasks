package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {

    public static void main(String[] args) throws IOException {

        TreeMap<Integer, String> map = new TreeMap<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String string = reader.readLine();
                if (string.equals("end")) {
                    break;
                }
                int index = Integer.parseInt(string.substring(string.lastIndexOf("t") + 1));
                if (!map.containsKey(index)) {
                    map.put(index, string);
                }
            }
        }

        for (String fileName : map.values()) {
            String shortName = fileName.substring(0, fileName.lastIndexOf("."));
            try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(fileName));
                 BufferedOutputStream outputStream = new BufferedOutputStream( new FileOutputStream(shortName, true))) {
                while (inputStream.available() > 0) {
                    outputStream.write(inputStream.read());
                }
            }
        }
    }
}
