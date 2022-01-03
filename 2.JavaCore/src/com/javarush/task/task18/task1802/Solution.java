package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        int minByte = Integer.MAX_VALUE;
        try (FileInputStream inputStream = new FileInputStream(str)) {
            while (inputStream.available() > 0) {
                int date = inputStream.read();
                if (minByte > date) {
                    minByte = date;
                }
            }
        }
        System.out.println(minByte);
    }
}
