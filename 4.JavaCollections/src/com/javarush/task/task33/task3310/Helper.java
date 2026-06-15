package com.javarush.task.task33.task3310;

import java.math.BigInteger;
import java.security.SecureRandom;

public class Helper {
    public static String generateRandomString() {
        // создаем специальный класс рандом который ведет себя не предсказуемо
        SecureRandom secureRandom = new SecureRandom();

        // создаем случайное число длиной 130 бит и указываем источник случайности
        BigInteger bigInteger = new BigInteger(130, secureRandom);

        // преобразуем число в строку в системе Base32 длиной в 26 символов
        // Base32 = 0-9A-V
        // почему 26 130 / 5 (количество бит на 1 символ) = 26
        return bigInteger.toString(32);
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}
