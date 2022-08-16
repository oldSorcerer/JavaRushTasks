package com.javarush.task.pro.task03.task0320;

public class Solution {

    static String sugar = "Сахар";
    static String milk = "Молоко";
    static String flour = "Мука";

    public static void main(String[] args) {
        String ingredient1 = sugar;
        String ingredient2 = milk;
        String ingredient3 = flour;

        if (ingredient1 == sugar || ingredient2 == sugar || ingredient3 == sugar) {
            System.out.println("Кладем сахар в миску");
        }
        if (ingredient1 == milk || ingredient2 == milk || ingredient3 == milk) {
            System.out.println("Кладем молоко в миску");
        }
        if (ingredient1 == flour || ingredient2 == flour || ingredient3 == flour) {
            System.out.println("Кладем муку в миску");
        }
    }
}
