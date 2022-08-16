package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if ((a >= b) && (a >= c)) {
            System.out.println(a + " ");
            if (b >= c) {
                System.out.println(b + " " + c);
            } else {
                System.out.println(c + " " + b);
            }
        } else if ((b >= a) && (b >= c)) {
            System.out.println(b + " ");
            if (a >= c) {
                System.out.println(a + " " + c);
            } else {
                System.out.println(c + " " + a);
            }
        } else {
            System.out.println(c + " ");
            if (b >= a) {
                System.out.println(b + " " + a);
            } else {
                System.out.println(a + " " + b);
            }
        }
    }
}
