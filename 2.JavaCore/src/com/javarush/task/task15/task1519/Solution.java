package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String string;
            while ( !(string = reader.readLine()).equalsIgnoreCase("exit") ) {
                try {
                    if (string.contains(".")) {
                        print(Double.parseDouble(string));
                    } else {
                        int number = Integer.parseInt(string);
                        if (number > 0 && number < 128) {
                            print((short) number);
                        } else {
                            print(number);
                        }
                    }
                } catch (Exception e) {
                    print(string);
                }
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
