package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if ((a != c) && (b == c))
            System.out.println(1);
        else if ((b != c) && (a == c))
            System.out.println(2);
        else if ((b != c) && (b == a))
            System.out.println(3);
    }
}
