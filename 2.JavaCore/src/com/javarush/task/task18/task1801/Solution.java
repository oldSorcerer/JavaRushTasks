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

        FileInputStream fileInputStream = new FileInputStream(str);

        int maxByte = 0;

        while (fileInputStream.available() > 0) {
            int date = fileInputStream.read();
            if (maxByte < date) {
                maxByte = date;
            }
        }
        fileInputStream.close();
        System.out.println(maxByte);
    }
}
