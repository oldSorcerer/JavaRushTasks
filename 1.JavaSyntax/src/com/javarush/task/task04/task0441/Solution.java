package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int c = Integer.parseInt(r.readLine());

        if (((a >= b) && (b >= c)) || ((c >= b) && (b >= a))) {
            System.out.println(b);
        } else if (((a >= c) && (c >= b)) || ((b >= c) && (c >= a))) {
            System.out.println(c);
        } else {
            System.out.println(a);
        }
    }
}
