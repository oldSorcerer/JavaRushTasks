package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* 
Смена кодировки
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(args[0]));
             BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(args[1]))
        ) {
            Charset windows1251 = Charset.forName("Windows-1251");

            while (inputStream.available() > 0) {

                int read = inputStream.read(new byte[inputStream.available()]);

                new String(new byte[inputStream.available()]);


//                outputStream.write(reader.readLine().getBytes(StandardCharsets.UTF_8));
            }
        }
    }
}
