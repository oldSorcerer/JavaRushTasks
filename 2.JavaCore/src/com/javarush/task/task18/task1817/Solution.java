package com.javarush.task.task18.task1817;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        StringBuilder builder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String string = reader.readLine();
                builder.append(string);
            }
        }

        int countAll = builder.length();
        int countSpace = 0;
        for (char aChar : builder.toString().toCharArray()) {
            if (Character.isSpaceChar(aChar)) {
                countSpace++;
            }
        }
        if (countAll != 0) {
            System.out.printf("%.2f", (double) countSpace / countAll * 100);
        }
    }
}
