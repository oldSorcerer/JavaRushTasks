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

        List<String> result = new ArrayList<>();


        for (int i = 1; i < list.size(); ) {
            String str = list.get(0);

            if (!result.contains(list.get(0))) {
                result.add(list.get(0));
            }
            char charAt = str.charAt(str.length() - 1);
            if (charAt == list.get(i).toLowerCase().charAt(0)) {
                list.set(0, list.get(i));
                result.add(list.get(i));
                list.remove(i);
                i = 1;
            } else {
                i++;
            }
        }

        String stringStart = result.get(0);
        String stringEnd = result.get(result.size() - 1);

        char charStart = stringStart.toLowerCase().charAt(0);
        char charEnd = stringEnd.charAt(stringEnd.length() - 1);

        StringBuilder builder = new StringBuilder(stringStart);
        if (charStart == charEnd) {
            for (int i = 1; i < result.size(); i++) {
                builder.append(" ").append(result.get(i));
            }
        }


//        StringBuilder result = new StringBuilder(list.get(0));

//                result.append(" ").append(list.get(j));

        return builder;
    }
}
