package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    public static int readInt() throws Exception {
        return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

    public static double readDouble() throws Exception {
        return Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

    public static boolean readBoolean() throws Exception {
        return Boolean.parseBoolean(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

    public static void main(String[] args) {

    }
}