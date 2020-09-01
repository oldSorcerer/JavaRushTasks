package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String fileName = reader.readLine();

        InputStream inputStream = new FileInputStream(fileName);

        while (inputStream.available() > 0) {
            System.out.print((char) inputStream.read());
        }
        inputStream.close();
        reader.close();

    }
}