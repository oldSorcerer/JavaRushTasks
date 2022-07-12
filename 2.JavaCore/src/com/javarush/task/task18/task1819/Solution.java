package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String pathFileOne = console.readLine();
        StringBuilder contentFileOne = new StringBuilder();

        try (BufferedReader readerFileOne = new BufferedReader(new FileReader(pathFileOne));
             OutputStream outputStream = new FileOutputStream(pathFileOne);
             BufferedReader readerFileTwo = new BufferedReader(new FileReader(console.readLine()))) {
            while (readerFileOne.ready()) {
                contentFileOne.append(readerFileOne.readLine());
            }
            while (readerFileTwo.ready()) {
                outputStream.write(readerFileTwo.readLine().getBytes());
            }
            outputStream.write(contentFileOne.toString().getBytes());
        }
    }
}