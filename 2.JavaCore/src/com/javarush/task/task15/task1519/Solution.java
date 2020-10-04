package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String string = rd.readLine();

            Scanner scanner = new Scanner(string);

            if (string.equals("exit")) {
                break;
            }

            if (string.contains(".")) {
                try {
                    Double value = Double.parseDouble(string);
                    print(value);
                } catch (NumberFormatException e) {
                    print(string);
                }

            } else if (scanner.hasNextInt()) {
                int integer = Integer.parseInt(string);
                if (integer > 0 && integer < 128 ) {
                    short value = Short.parseShort(string);
                    print(value);
                }
                if (integer <= 0 || integer >= 128) {
                    print(integer);
                }
            } else print(string);
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
