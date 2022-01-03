package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        int maxByte = 0;
        try (FileInputStream inputStream = new FileInputStream(str)) {
            while (inputStream.available() > 0) {
                int date = inputStream.read();
                if (maxByte < date) {
                    maxByte = date;
                }
            }
        }
        System.out.println(maxByte);
    }
}
