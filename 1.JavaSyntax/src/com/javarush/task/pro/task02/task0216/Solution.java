package com.javarush.task.pro.task02.task0216;

/* 
Генератор позитивных новостей
*/

public class Solution {
    public static void main(String[] args) {
        String name = "Учёный";
        String date = "17.06.2035";
        String time = "в 02:34";
        String adjective = "удивительный";
        String noun = "сверхприбор,";
        String verb = "передаёт и принимает";

        System.out.println("Новости:");
        System.out.println(name + " " + date + " " + time + " изобрел " + adjective +
                " " + noun + " который " + verb + " террабайты данных в минуту.");
    }
}
