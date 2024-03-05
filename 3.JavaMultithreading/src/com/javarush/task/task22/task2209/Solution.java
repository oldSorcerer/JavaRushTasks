package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.*;

/* 
Составить цепочку слов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String[] strings = null;
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))) {

            while (reader.ready()) {
                strings = reader.readLine().split(" ");
            }
        }
        StringBuilder result = getLine(strings);
        System.out.println(result);
    }

    public static StringBuilder getLine(String... words) {
        if (words == null || words.length == 0) {
            return new StringBuilder();
        }

        List<StringBuilder> builderList = new ArrayList<>();

        for (String word : words) {

            StringBuilder builder = new StringBuilder(word);


            List<String> list = new ArrayList<>(Arrays.asList(words));
            list.remove(word);

            int count = 0;
            while (!list.isEmpty()) {
                String firstStartChar = builder.substring(0, 1);
                String firstEndChar = builder.substring(builder.length() - 1);

                String secondStartChar = list.get(0).substring(0, 1);
                String secondEndChar = list.get(0).substring(list.get(0).length() - 1);

                if (firstEndChar.equalsIgnoreCase(secondStartChar)) {
                    builder.append(" ").append(list.get(0));
                    list.remove(0);
                } else if (firstStartChar.equalsIgnoreCase(secondEndChar)) {
                    builder.insert(0, list.get(0) + " ");
                    list.remove(0);
                } else {
                    String str = list.get(0);
                    list.remove(0);
                    list.add(str);
                    count++;
                    if (count > Math.pow(words.length, 2)) {
                        break;
                    }
                }
            }
            builderList.add(builder);
            builder = new StringBuilder();
        }
        return builderList.stream().max(Comparator.comparingInt(StringBuilder::length)).get();
    }
}
//Якутск Дербент Арзамас Рог Киев Кувшиново Капустин-Яр Стокгольм Флоренция Глен-Хоп Тобольск Нью-Йорк Афины Муром Осташков Прага Кострома Вена Амстердам Мельбурн Волгоград Минск