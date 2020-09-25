package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        int[] number = new int[2];

        for (int i = 0; i < 2; i++) {
            number[i] = Integer.parseInt(rd.readLine());
        }
        if (number[0] <= 0 || number[1] <= 0)
            throw new Exception("test");

        BigInteger bi1 = BigInteger.valueOf(number[0]);
        BigInteger bi2 = BigInteger.valueOf(number[1]);

        System.out.println(bi1.gcd(bi2));
    }
}
