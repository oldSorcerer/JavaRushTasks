package com.javarush.task.pro.task03.task0321;

public class Solution {

    public static void main(String[] args) {
        System.out.println("Чтобы вернуть контроль над складом введите пароль:");

        if ("QWERTY".equalsIgnoreCase("qwerty")) {
            System.out.println("Контроль получен");
        } else {
            System.out.println("Пароль неверный");
        }

    }
}
