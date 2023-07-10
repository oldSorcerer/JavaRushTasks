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
        writeMessage("Please choose a currency code, for example USD");
        String currencyCode = readString();
        if (currencyCode == null || currencyCode.trim().length() != 3) {
            writeMessage("Please specify valid data.");
            currencyCode = askCurrencyCode();
        }
        return currencyCode.toUpperCase();
    }

    public static String[] getValidTwoDigits(String currencyCode) {
        while (true) {
            writeMessage(String.format("Please specify integer denomination and " +
                    "integer count. For example '10 3' means 30 %s", currencyCode));
            String string = readString();
            String[] strings = null;
            if (string == null || (readString().split(" ")).length != 2) {
                writeMessage("Please specify valid data.");
            } else {
                try {
                    if (Integer.parseInt(strings[0]) <= 0 || Integer.parseInt(strings[1]) <= 0) {
                        writeMessage("Please specify valid data.");
                    }
                } catch (NumberFormatException e) {
                    writeMessage("Please specify valid data.");
                    continue;
                }
            }
            return strings;
        }
    }
}
