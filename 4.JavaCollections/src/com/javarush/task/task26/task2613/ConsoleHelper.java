package com.javarush.task.task26.task2613;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {

    private static BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {
        try {
            return bis.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String askCurrencyCode() {
        writeMessage("Введите код валюты");
        String string = readString();
        if (string.length() != 3) {
            writeMessage("Код Валюты должен быть строго 3 символа");
            string = askCurrencyCode();
        }
        return string.toUpperCase();
    }

    public static String[] getValidTwoDigits(String currencyCode) {
        String [] strings = null;
        writeMessage("Введите два целых положительных числа:");
        try {
            int denomination = Integer.parseInt(readString());
            int count = Integer.parseInt(readString());
        } catch (NumberFormatException e) {


        }
        return strings;
    }
}
