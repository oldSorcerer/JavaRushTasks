package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) throws IOException {

        Map<Integer, String> map = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String string = reader.readLine();
                if (string.equals("end")) {
                    break;
                }
                String substring = string.substring(string.lastIndexOf(".part") + 5);
                int index = Integer.parseInt(substring);
                if (!map.containsKey(index)) {
                    map.put(index, string);
                }
            }
        }

        for (Map.Entry<Integer, String> pair : map.entrySet()) {
            String fileName = pair.getValue();
            String shortName = fileName.substring(0, fileName.lastIndexOf("."));
            try (InputStream inputStream = new FileInputStream(fileName);
                 OutputStream outputStream = new FileOutputStream(shortName)) {
                byte[] buffer = new byte[inputStream.available()];
                while (inputStream.available() > 0) {
                    int read = inputStream.read(buffer);
                    outputStream.write(buffer, 0, read);
                }
            }
        }
    }
}
