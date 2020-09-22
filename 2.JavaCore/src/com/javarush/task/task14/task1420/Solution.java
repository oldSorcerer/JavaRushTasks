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

        String string;

        BigInteger bigInteger = BigInteger.valueOf(2);
        BigInteger bigInteger2 = bigInteger.gcd(BigInteger.valueOf(5));

        System.out.println(bigInteger2);


//         for (int i = 0; i < 2; i++) {
//            string = rd.readLine();
//            int number = Integer.parseInt(string);
//            if (number < 0)
//                throw  new Exception("test");
//
//        }


    }
}
