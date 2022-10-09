package com.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        Path path = Paths.get(str);

        List<String> strings = Files.readAllLines(path);

        for (String string : strings) {
            System.out.println(string.replaceAll("[.,\\s]", ""));
        }
    }
}

// Files.readAllLines(Path.of(new Scanner(System.in).nextLine()))
//                .stream().map(str -> str.replaceAll("[.,\\s]", ""))
//                .forEach(System.out::println);