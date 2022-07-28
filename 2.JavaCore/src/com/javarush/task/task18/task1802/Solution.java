package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int minByte = Integer.MAX_VALUE;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine())
        ) {
            while (inputStream.available() > 0) {
                int data = inputStream.read();
                if (minByte > data) {
                    minByte = data;
                }
            }
        }
        System.out.println(minByte);
    }
}
