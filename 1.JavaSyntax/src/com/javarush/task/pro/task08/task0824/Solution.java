package com.javarush.task.pro.task08.task0824;

/* 
Парадокс Диего
*/

import java.util.Random;

public class Solution {

    public static void main(String[] args) {
        Diego[] diegos = new Diego[99];
        for (int i = 0; i < diegos.length; i++) {
            diegos[i] = new Diego();
        }

        System.out.print(diegos[0].hashSum + " ^ ");
        Nimrod[] nimrods = dealWithDuplicates(diegos);
        System.out.println(nimrods[0].password + " = " + diegos[0].hashSum);
    }

    public static Nimrod[] dealWithDuplicates(Diego[] diegos) {
        Random random = new Random();
        Nimrod[] nimrods = new Nimrod[diegos.length];
        for (int i = 0; i < diegos.length; i++) {
            int password = random.nextInt();
            diegos[i].hashSum ^= password;
            Nimrod nimrod = new Nimrod();
            nimrod.password = password;
            nimrods[i] = nimrod;
        }
        return nimrods;
    }
}
