package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(console.readLine()))) {
            while (reader.ready()) {
                String[] strings = reader.readLine().split(" ");
                String str = Arrays.stream(strings).map(string -> (int) Math.round(Double.parseDouble(string)) + " ").collect(Collectors.joining());
                writer.write(str + System.lineSeparator());
            }
        }
    }
}