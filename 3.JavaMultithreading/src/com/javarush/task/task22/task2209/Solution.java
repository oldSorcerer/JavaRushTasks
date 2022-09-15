package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

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
        if (words == null) {
            return null;
        }
        List<String> list = Arrays.asList(words);

        StringBuilder result = new StringBuilder(list.get(0));
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size();) {
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
        return result;
    }
}
