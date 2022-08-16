package com.javarush.task.task09.task0928;

import java.io.*;

/* 
Код не компилится…
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             InputStream fileInputStream = getInputStream(reader.readLine());
             OutputStream fileOutputStream = getOutputStream(reader.readLine())) {

            int count = 0;
            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
                count++;
            }

            System.out.println("Скопировано байт " + count);
        }
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}