package com.javarush.task.task32.task3201;

import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Запись в существующий файл
*/

public class Solution {
    public static void main(String... args) throws IOException {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(args[0], "rw")) {
            int skip = Integer.parseInt(args[1]);
            long length = randomAccessFile.length();
            randomAccessFile.seek(length > skip ? skip : length);
            randomAccessFile.write(args[2].getBytes());
        }
    }
}
