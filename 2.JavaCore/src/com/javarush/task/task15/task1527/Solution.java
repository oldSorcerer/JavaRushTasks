package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String url = reader.readLine();
        String url = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";

        int index = url.indexOf("?");
        String[] split = url.substring(url.indexOf("?") + 1).split("&");
        /*for (String str : split) {
            if (str.contains("obj")) {
                String obj = str.substring(4);
                double aDouble = Double.parseDouble(obj);
                alert(aDouble);
            }
        }*/
        for (String str : split) {
            System.out.print(str + " ");
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
