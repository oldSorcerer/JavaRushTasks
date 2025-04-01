package com.javarush.task.task18.task1820;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/* 
Округление чисел
*/

public class Solution {
    public static void main1(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(console.readLine()))) {
            while (reader.ready()) {
                String[] strings = reader.readLine().split(" ");
                String str = Arrays.stream(strings).map(string -> (int) Math.round(Double.parseDouble(string)) + " ").collect(Collectors.joining());
                writer.write(str);
                writer.newLine();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = Files.readAllLines(Path.of(scanner.nextLine()));
        List<String> list = strings.stream().map(str -> str.split(" "))
                .flatMap(array -> Arrays.stream(array).map(Double::parseDouble).map(Math::round).map(number -> String.join(" "))).toList();
        Files.write(Path.of(scanner.nextLine()), list);


    }

}