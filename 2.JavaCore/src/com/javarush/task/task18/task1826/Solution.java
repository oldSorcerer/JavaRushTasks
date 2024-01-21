package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (FileInputStream inputStream = new FileInputStream(args[1]);
             FileOutputStream outputStream = new FileOutputStream(args[2])) {
            if (args[0].equalsIgnoreCase("-e")) {
                while (inputStream.available() > 0) {
                    int read = inputStream.read();
                    outputStream.write(read + 1);
                }
            } else if (args[0].equalsIgnoreCase("-d")) {
                while (inputStream.available() > 0) {
                    int read = inputStream.read();
                    outputStream.write(read - 1);
                }
            }
        }
    }
}
