package com.javarush.task.task36.task3605;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

/* 
Использование TreeSet
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Set<Character> set = new TreeSet<>();
        StringBuilder builder = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]));) {
            while (reader.ready()) {
                builder.append(reader.readLine());
            }
        }
        String string = builder.toString().replaceAll("\\W", "").toLowerCase();

        for (Character aChar : string.toCharArray()) {
            set.add(aChar);
        }

        set.stream().limit(5).forEach(System.out::print);
    }
}
