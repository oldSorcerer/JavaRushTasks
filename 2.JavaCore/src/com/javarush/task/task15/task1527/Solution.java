package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/* 
Парсер реквестов
*/

public class Solution {

    public static void main1(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

//        String[] words = url.substring(url.lastIndexOf("?") + 1).split("&");

        String[] words = new URL(url).getQuery().split("&");
        for (String word : words) {
            System.out.println((word.contains("=") ? word.substring(0, word.indexOf("=")) : word) + " ");
        }
        System.out.println();
        for (String word : words) {
            if (word.contains("obj")) {
                String str = word.substring(word.indexOf("=") + 1);
                try {
                    alert(Double.parseDouble(str));
                } catch (NumberFormatException e) {
                    alert(str);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

        String string = url.substring(url.lastIndexOf("?") + 1);
        String[] arguments = string.split("&");

        String objValue = null;

        for (String argument : arguments) {
            if (argument.contains("=")) {
                String[] elements = argument.split("=");

                if (elements[0].equals("obj")) {
                    objValue = elements[1];
                }
                System.out.print(elements[0] + " ");
            } else {
                System.out.print(argument + " ");
            }
        }

        System.out.println();

        if (objValue != null) {
            try {
                double doubleValue = Double.parseDouble(objValue);
                alert(doubleValue);
            } catch (NumberFormatException e) {
                alert(objValue);
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