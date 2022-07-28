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
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine())
        ) {
            while (inputStream.available() > 0) {
                int data = inputStream.read();
                char aChar = (char) data;
                if (aChar == ',') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}