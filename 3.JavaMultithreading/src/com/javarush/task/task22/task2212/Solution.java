package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/

public class Solution {
    public static boolean checkTelNumber(String telNumber) {

//        if (telNumber.charAt(0))


        if (telNumber.contains("+()"))

        if (!Character.isDigit(telNumber.charAt(telNumber.length() - 1))) {
            return false;
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
