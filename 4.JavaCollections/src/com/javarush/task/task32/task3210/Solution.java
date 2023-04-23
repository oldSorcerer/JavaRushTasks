package com.javarush.task.task32.task3210;

import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) throws IOException {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(args[0], "rw")) {
            int number = Integer.parseInt(args[1]);
            String text = args[2];

            randomAccessFile.seek(number);

            byte[] buff = new byte[text.length()];
            randomAccessFile.read(buff, 0, buff.length);

            randomAccessFile.write(text.equals(new String(buff)) ? "true".getBytes() : "false".getBytes());
        }
    }
}
