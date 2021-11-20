package com.javarush.task.pro.task09.task0908;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        // проверяем если binaryNumber ноль или содержит пустую строку (isEmpty) или имеет символы отличные от 0 и 1
        if (binaryNumber == null || binaryNumber.isEmpty() || !binaryNumber.matches("[01]+")) {
            return "";
        } // если количество символов не кратно 4 добовляем еще 1
        if (binaryNumber.length() % 4 != 0) {
            binaryNumber = "0" + binaryNumber;
        }
        String hexNumber = ""; // в цыкле проверяем что дина строки кратна 4 и что строка больше 0
        while (binaryNumber.length() % 4 == 0 && binaryNumber.length() > 0) {
            String fourBit = binaryNumber.substring(0, 4); // отделяем первые 4 символа

            String oneHex  = switch (fourBit) { // это многоуровнивый if else где мы сравниваем отделенные 4 байта
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
                case "1010" -> "a"; //10
                case "1011" -> "b"; //11
                case "1100" -> "c"; //12
                case "1101" -> "d"; //13
                case "1110" -> "e"; //14
                case "1111" -> "f"; //15
                default -> null;
            };

            hexNumber += oneHex; // если сть совпадения записываем их в новую переменную

            int index = binaryNumber.length(); // определяем дленну строки
            binaryNumber = binaryNumber.substring(4, index); // перезапысываем нашу же строку новой но уже с 4 индекса и до конца
        }
        return hexNumber;
    }

    public static String toBinary(String hexNumber) {
        // та же проверка что и выше только вхождени на другие сымволы
        if (hexNumber == null || hexNumber.isEmpty() || !hexNumber.matches("[0-9a-f]+")) {
            return "";
        }
        String binaryNumber = "";
        for (int i = 0; i < hexNumber.length(); i++) {
            String oneHex = String.valueOf(hexNumber.charAt(i)); // берем первый символ переделываем его в стринг
            String oneBit = switch (oneHex) { // находим символу выше соотведствие
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
            binaryNumber += oneBit; // собираем строку
        }
        return binaryNumber;
    }
}