package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(reader.readLine());
            int maximum = Integer.MIN_VALUE;
            if (N > 0) {
                for (int i = 0; i < N; i++) {
                    int chislo = Integer.parseInt(reader.readLine());
                    if (chislo > maximum)
                        maximum = chislo;
                }
            }
            System.out.println(maximum);
        }
    }
}