package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String string : array) {
            System.out.println(string);
        }
    }

    public static void sort(String[] array) {
        int y;
        String a;
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                for (int j = 0; j < array.length; j++) {
                    if (isNumber(array[j]) && (Integer.parseInt(array[i]) > Integer.parseInt(array[j]))) {
                        y = Integer.parseInt(array[i]);
                        array[i] = array[j];
                        array[j] = String.valueOf(y);
                    }
                }
            } else {
                for (int j = 0; j < array.length; j++) {
                    if (!isNumber(array[j]) && (isGreaterThan(array[j], array[i]))) {
                        a = array[i];
                        array[i] = array[j];
                        array[j] = a;
                    }
                }
            }
        }
    }

    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-')
                    || (!Character.isDigit(c) && c != '-')) {
                return false;
            }
        }
        return true;
    }
}