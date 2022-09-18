package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/

public class Solution {
    public static boolean checkTelNumber(String telNumber) {

        if (telNumber == null) {
            return false;
        }
/*
        if (telNumber.matches("^\\+\\d{12}$")) {
            return true;
//        } else if (telNumber.matches("^\\+\\d{2}\\(\\d{3}\\)\\d{7}")) {
//            return true;
        } else if (telNumber.matches("^\\+(\\d{1,8})?\\(\\d{3}\\)(\\d{1,8})?$")) {
            return true;
//        } else if (telNumber.matches("^\\(\\d{3}\\)\\d{7}$")) {
//            return true;
        } else if (telNumber.matches("^(\\d{1,6})?\\(\\d{3}\\)(\\d{1,6})?$")) {
            return true;
        } else if (telNumber.matches("^(\\d)?\\(\\d{3}\\)\\d{6,7}$")) {
            return true;
        }
*/
        boolean matches = telNumber.matches("^\\+(\\d[()]?){12}$");

        boolean matches1 = telNumber.matches("^([()]?\\d){10}$");

        boolean matches2 = telNumber.matches("^(\\+)?(\\d+)?(\\(\\d{3}\\))?\\d+$");

        return (matches || matches1) && matches2;
    }

    public static void main(String[] args) {

        System.out.println("+380501234567 - true = " + checkTelNumber("+380501234567"));
        System.out.println("+3805012345673 - false = " + checkTelNumber("+3805012345673"));
        System.out.println("+38050123456 - false = " + checkTelNumber("+38050123456"));
        System.out.println("+38(050)1234567 - true = " + checkTelNumber("+38(050)1234567"));
        System.out.println("(050)1234567 - true = " + checkTelNumber("(050)1234567"));
        System.out.println("0(501)234567 - true = " + checkTelNumber("0(501)234567"));
        System.out.println("+38)050(1234567 - false = " + checkTelNumber("+38)050(1234567"));
        System.out.println("+38(050)123-45-67 - false = " + checkTelNumber("+38(050)123-45-67"));
        System.out.println("050ххх4567 - false = " + checkTelNumber("050ххх4567"));
        System.out.println("050123456 - false = " + checkTelNumber("050123456"));
        System.out.println("(0)501234567 - false = " + checkTelNumber("(0)501234567"));
        System.out.println("123456789012 - false = " + checkTelNumber("123456789012"));
        System.out.println("123(456)7890 - true = " + checkTelNumber("123(456)7890"));
        System.out.println("123456(789)0 - true = " + checkTelNumber("123456(789)0"));
        System.out.println("+123(456)789012 - true = " + checkTelNumber("+123(456)789012"));
        System.out.println("+123456(789)012 - true = " + checkTelNumber("+123456(789)012"));
        System.out.println("+123456789(456) - false = " + checkTelNumber("+123456789(456)"));
        System.out.println("Проверка на пустую строку \"\" - false = " + checkTelNumber(""));
        System.out.println("Проверка на null - false =  " + checkTelNumber(null));

    }
}
