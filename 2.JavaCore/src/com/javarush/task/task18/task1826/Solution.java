package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (FileInputStream input = new FileInputStream(args[1]);
             FileOutputStream output = new FileOutputStream(args[2])) {

            while (input.available() > 0) {
                int read = input.read();
                if (args[0].equalsIgnoreCase("-e")) {
                    output.write(read + 1);
                } else if (args[0].equalsIgnoreCase("-d")) {
                    output.write(read - 1);
                }
            }
        }
    }
}
