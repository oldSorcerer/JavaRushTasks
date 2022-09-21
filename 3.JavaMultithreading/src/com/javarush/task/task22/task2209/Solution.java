package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Составить цепочку слов
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        String[] strings = null;
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(console.readLine());
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            while (reader.ready()) {
                strings = reader.readLine().split(" ");
            }
        }
        StringBuilder result = getLine(strings);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        if (words == null || words.length == 0) {
            return null;
        }

        List<String> list = new ArrayList<>(Arrays.asList(words));


        StringBuilder result = new StringBuilder(list.get(0));
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); ) {
                String str = list.get(i);
                char charAt = str.charAt(str.length() - 1);
                if (charAt == list.get(j).toLowerCase().charAt(0)) {
                    result.append(" ").append(list.get(j));
                    list.set(i, list.get(j));
                    list.remove(j);
                    j--;
                } else {
                    j++;
                }
            }
        }

        StringBuilder builder = new StringBuilder(words[0]);

        List<String> list2 = new ArrayList<>();

        for (int i = 1; i < words.length; i++) {
            list2.add(words[i]);
        }


        int count = 0;
        while (!list2.isEmpty()) {
            String firstStartChar = builder.substring(0, 1);
            String firstEndChar = builder.substring(builder.length() - 1);
            String secondChar = list2.get(0).substring(0, 1);

            if (firstEndChar.equalsIgnoreCase(secondChar)) {
                builder.append(" ").append(list2.get(0));
                list2.remove(0);
            } else if (firstStartChar.equalsIgnoreCase(secondChar)) {
                builder.insert(0, list2.get(0) + " ");
            } else {
                String str = list2.get(0);
                list2.remove(0);
                list2.add(str);
                count++;
            }


        }


        return result;

    }
}
