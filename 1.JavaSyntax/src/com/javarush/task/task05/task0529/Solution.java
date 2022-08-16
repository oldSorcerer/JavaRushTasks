package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String t;
        int s = 0;
        while (true) {
            t = reader.readLine();
            if (t.equals("сумма")) break;
            else s = s + Integer.parseInt(t);
        }
        System.out.print(s);
    }
}