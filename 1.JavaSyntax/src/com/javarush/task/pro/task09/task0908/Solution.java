package com.javarush.task.pro.task09.task0908;

/* 
Двоично-шестнадцатеричный конвертер
*/

import java.util.Arrays;

public class Solution {

    private static final String HEX = "0123456789abcdef";
    private static final String[] BINARY =
                    {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                     "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.isEmpty() || !binaryNumber.matches("[01]+")) {
            return "";
        }

        while (binaryNumber.length() % 4 != 0) {
            binaryNumber = "0" + binaryNumber;
        }

        StringBuilder hexNumber = new StringBuilder();
        while (!binaryNumber.isEmpty()) {
            String fourBit = binaryNumber.substring(0, 4);
            int index = Arrays.binarySearch(BINARY, fourBit);
            char charAt = HEX.charAt(index);
            hexNumber.append(charAt);
            binaryNumber = binaryNumber.substring(4);
        }

        return hexNumber.toString();
    }

    public static String toBinary(String hexNumber) {
        if (hexNumber == null || hexNumber.isEmpty() || !hexNumber.matches("[0-9a-f]+")) {
            return "";
        }

        StringBuilder binaryNumber = new StringBuilder();

        for (int i = 0; i < hexNumber.length(); i++) {
            char charAt = hexNumber.charAt(i);
            int index = HEX.indexOf(charAt);
            String fourBit = BINARY[index];
            binaryNumber.append(fourBit);
        }

        return binaryNumber.toString();
    }

    public static String toHex1(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.isEmpty() || !binaryNumber.matches("[01]+")) {
            return "";
        }
        while (binaryNumber.length() % 4 != 0) {
            binaryNumber = "0" + binaryNumber;
        }
        String hexNumber = "";
        while (!binaryNumber.isEmpty()) {
            String fourBit = binaryNumber.substring(0, 4);

            String oneHex = switch (fourBit) {
                case "0000" -> "0";
                case "0001" -> "1";
                case "0010" -> "2";
                case "0011" -> "3";
                case "0100" -> "4";
                case "0101" -> "5";
                case "0110" -> "6";
                case "0111" -> "7";
                case "1000" -> "8";
                case "1001" -> "9";
                case "1010" -> "a";
                case "1011" -> "b";
                case "1100" -> "c";
                case "1101" -> "d";
                case "1110" -> "e";
                case "1111" -> "f";
                default -> null;
            };

            hexNumber += oneHex;

            int index = binaryNumber.length();
            binaryNumber = binaryNumber.substring(4, index);
        }
        return hexNumber;
    }

    public static String toBinary1(String hexNumber) {
        if (hexNumber == null || hexNumber.isEmpty() || !hexNumber.matches("[0-9a-f]+")) {
            return "";
        }
        String binaryNumber = "";
        for (int i = 0; i < hexNumber.length(); i++) {
            String oneHex = String.valueOf(hexNumber.charAt(i));
            String fourBit = switch (oneHex) {
                case "0" -> "0000";
                case "1" -> "0001";
                case "2" -> "0010";
                case "3" -> "0011";
                case "4" -> "0100";
                case "5" -> "0101";
                case "6" -> "0110";
                case "7" -> "0111";
                case "8" -> "1000";
                case "9" -> "1001";
                case "a" -> "1010";
                case "b" -> "1011";
                case "c" -> "1100";
                case "d" -> "1101";
                case "e" -> "1110";
                case "f" -> "1111";
                default -> null;
            };
            binaryNumber += fourBit;
        }
        return binaryNumber;
    }
}