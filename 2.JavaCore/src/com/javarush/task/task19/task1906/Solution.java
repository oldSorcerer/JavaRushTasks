package com.javarush.task.task19.task1906;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* 
Четные символы
*/

public class Solution {
    public static void main1(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileReader fileReader = new FileReader(reader.readLine());
             FileWriter fileWriter = new FileWriter(reader.readLine())) {
            while (fileReader.ready()) {
                int read = fileReader.read();
                list.add(read);
            }
            for (int i = 1; i < list.size(); i += 2) {
                fileWriter.write(list.get(i));
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String string = Files.readString(Path.of(new Scanner(System.in).nextLine()));

        String collect = IntStream.range(0, string.length())
                .filter(index -> index % 2 != 0)
                .mapToObj(intdex -> String.valueOf(string.charAt(intdex)))
                .collect(Collectors.joining());


        Files.writeString(Path.of(new Scanner(System.in).nextLine()), collect);

    }
}