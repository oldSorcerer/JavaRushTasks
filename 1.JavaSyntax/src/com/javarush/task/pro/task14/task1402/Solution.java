package com.javarush.task.pro.task14.task1402;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 
Помощник преподавателя
*/

public class Solution {

    public static final String PROMPT_STRING = "Введите номер студента, или exit для выхода: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "Отвечает ";
    public static final String NOT_EXIST = "Студента с таким номером не существует";

    static List<String> studentsJournal = Arrays.asList(
            "Тимур Мясной"
            , "Пенелопа Сиволап"
            , "Орест Злобин"
            , "Ирида Продувалова"
            , "Гектор Гадюкин"
            , "Электра Чемоданова"
            , "Гвидон Недумов"
            , "Роксана Борисенко"
            , "Юлиан Мумбриков"
            , "Зигфрид Горемыкин");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(PROMPT_STRING);
            String input = scanner.nextLine();
            if (input.toLowerCase().equals(EXIT)) {
                break;
            }
            int studentId = Integer.parseInt(input);
            try {
                System.out.println(ANSWERING + studentsJournal.get(studentId));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(NOT_EXIST);
            }
        }
    }
}
