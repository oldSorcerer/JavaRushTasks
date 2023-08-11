package com.javarush.task.task33.task3310;

import java.math.BigInteger;
import java.security.SecureRandom;

public class Helper {
    public static String generateRandomString() {
        SecureRandom random = new SecureRandom();
        BigInteger integer = new BigInteger(130, random);

        return integer.toString(32);
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}
