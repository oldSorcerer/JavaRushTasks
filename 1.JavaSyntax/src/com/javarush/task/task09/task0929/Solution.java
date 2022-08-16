package com.javarush.task.task09.task0929;

import java.io.*;

/* 
Обогатим код функциональностью!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();
        String sourceFileName2 = reader.readLine();
        InputStream fileInputStream;
        try {
            fileInputStream = getInputStream(sourceFileName);
        } catch (IOException e) {
            System.out.println("Файл не существует.");
            try {
                fileInputStream = getInputStream(sourceFileName);
            } catch (IOException e1) {
                fileInputStream = getInputStream(sourceFileName2);
            }
        }
        OutputStream fileOutputStream = getOutputStream(destinationFileName);

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}