package com.javarush.task.task18.task1817;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();
        int countSpace = 0;

        try (FileReader fileReader = new FileReader(args[0]);
             BufferedReader reader = new BufferedReader(fileReader)) {
            while (reader.ready()) {
                String string = reader.readLine();
                stringBuilder.append(string);
            }
            String bigString = stringBuilder.toString();
            int countAll = bigString.length();
            for (char aChar : bigString.toCharArray()) {
                if (Character.isSpaceChar(aChar)) {
                    countSpace++;
                }
            }
            if (countAll != 0) {
                System.out.printf("%.2f", (double) countSpace / countAll * 100);
            }
        }
    }
}
