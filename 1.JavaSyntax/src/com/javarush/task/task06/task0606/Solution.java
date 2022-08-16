package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String string = reader.readLine();
        int a = Integer.parseInt(string);
        int len = string.length();
        int w = 1;

        while (len > 0) {
            if ((((a / w) % 10) % 2) == 0) {
                even++;
            } else {
                odd++;
            }
            w = w * 10;
            len--;
        }
        System.out.print("Even: " + even + " Odd: " + odd);
    }
}