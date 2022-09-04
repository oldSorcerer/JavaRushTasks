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
        int number;
        int result;
        do {
            number = random.nextInt(upperBound - lowerBound) + lowerBound;
            result = nextAttempt(number);
        } while (number != result);
        Field declaredField = CosmicAnomaly.class.getDeclaredField("rightNumber");
        declaredField.setAccessible(true);


    }
}