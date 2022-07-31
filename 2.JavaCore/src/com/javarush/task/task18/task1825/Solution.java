package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {

    public static void main(String[] args) throws IOException {

        TreeSet<String> set = new TreeSet<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String string = reader.readLine();
                if (string.equals("end")) {
                    break;
                }
                set.add(string);
            }
        }
        set.stream().sorted().forEach(i -> new ReadThread(i).start());
    }

    static class ReadThread extends Thread {
        String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            String shortName = fileName.substring(0, fileName.lastIndexOf("."));
            try (InputStream inputStream = new FileInputStream(fileName);
                OutputStream outputStream = new FileOutputStream(shortName, true)
            ) {
                byte[] buffer = new byte[inputStream.available()];
                while (inputStream.available() > 0) {
                    int read = inputStream.read(buffer);
                    outputStream.write(buffer, 0, read);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
