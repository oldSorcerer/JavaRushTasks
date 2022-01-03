package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int count = 0;

        try (FileInputStream inputStream = new FileInputStream(str)) {
            while (inputStream.available() > 0) {
                int read = inputStream.read();
                char aChar = (char) read;
                if (aChar == ',') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
