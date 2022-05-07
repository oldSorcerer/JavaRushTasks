package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

        String[] words = url.substring(url.indexOf("?") + 1).split("&");

        for (String word : words) {
            if (word.contains("=")) {
                System.out.print(word.substring(0, word.indexOf("=")) + " ");
            } else {
                System.out.print(word + " ");
            }
        }
        System.out.println(" ");
        for (String word : words) {
            if (word.contains("obj")) {
                try {
                    alert(Double.parseDouble(word.substring(4)));
                } catch (NumberFormatException e) {
                    alert(word.substring(4));
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
