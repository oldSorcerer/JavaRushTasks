package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Collectors;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))) {
            while (reader.ready()) {
                String string = reader.readLine();
                String[] strings = string.split(" ");
                if (args[0].equals(strings[0])) {
                    System.out.println(string);
                }
            }
        }

        System.out.println(String.join(" ", Files.readAllLines(Path.of(new BufferedReader(new InputStreamReader(System.in)).readLine()))
                .stream()
                .map(str -> str.split(" "))
                .filter(strings -> strings[0].equals(args[0]))
                .findFirst().orElseThrow()));
    }
}
