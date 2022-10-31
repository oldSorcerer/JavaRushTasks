package com.javarush.task.pro.task08.task0819;

import java.lang.reflect.Field;
import java.util.Random;

/*
Амиголятор и Био-диего
*/

import static com.javarush.task.pro.task08.task0819.CosmicAnomaly.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            int number = random.nextInt(upperBound - lowerBound) + lowerBound;
            int result = nextAttempt(number);
            if (number == result) {
                break;
            }
        }
//        for (int i = 0; i < 30; i++) {
//            int number = random.nextInt(upperBound - lowerBound) + lowerBound;
//            nextAttempt(number);
//
//            Field declaredField = CosmicAnomaly.class.getDeclaredField("rightNumber");
//            declaredField.setAccessible(true);
//            int number2 = (int) declaredField.get(new CosmicAnomaly());
//
//            if (number == number2) {
//                break;
//            }
//        }
    }
}