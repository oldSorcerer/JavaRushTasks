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
        writeMessage("Введите два целых положительных числа:");
        String string = readString();
        String[] split = string.split(" ");
        if (split.length != 2) {
            writeMessage("Количество целых чисел должно быть строго 2");
            split = getValidTwoDigits(currencyCode);
        }
        try {
            if (Integer.parseInt(split[0]) <= 0 || Integer.parseInt(split[1]) <= 0) {
                writeMessage("Числа должны быть положительные");
                split = getValidTwoDigits(currencyCode);
            }
        } catch (NumberFormatException e) {
            writeMessage("Водите только числа");
            split = getValidTwoDigits(currencyCode);
        }
        return split;
    }

    public static Operation askOperation() {
        writeMessage("Введите номер операции:");
        writeMessage("\t 1 - INFO");
        writeMessage("\t 2 - DEPOSIT");
        writeMessage("\t 3 - WITHDRAW");
        writeMessage("\t 4 - EXIT");
        try {
            int number = Integer.parseInt(readString().trim());
            return Operation.getAllowableOperationByOrdinal(number);
        } catch (Exception e) {
            writeMessage("Не корректный номер операции");
            return askOperation();
        }
    }
}
