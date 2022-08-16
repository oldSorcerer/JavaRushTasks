package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a == b) {
            System.out.print(a + " " + b);
            if (a == c) {
                System.out.println(" " + c);
            }
        } else if (c == b) {
            System.out.println(c + " " + b);
        } else if (a == c) {
            System.out.println(a + " " + c);
        }
    }
}