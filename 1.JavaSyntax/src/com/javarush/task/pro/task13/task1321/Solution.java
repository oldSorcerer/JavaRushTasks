package com.javarush.task.pro.task13.task1321;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вторник"));
        System.out.println(getTranslationForDayOfWeek("Пятница"));
        System.out.println(getTranslationForDayOfWeek("Высплюсенье"));
    }

    public static String getTranslationForDayOfWeek(String ru) {
        String en;
        switch (ru.toLowerCase()) {
            case "понедельник":
                en = "Monday";
                break;
            case "вторник":
                en = "Tuesday";
                break;
            case "среда":
                en = "Wednesday";
                break;
            case "четверг":
                en = "Thursday";
                break;
            case "пятница":
                en = "Friday";
                break;
            case "суббота":
                en = "Saturday";
                break;
            case "воскресенье":
                en = "Sunday";
                break;
            default:
                en = "Недействительный день недели";
        }
        return en;

    }
}
