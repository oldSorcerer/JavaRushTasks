package com.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        List<String> strings = Files.readAllLines(Path.of(str));

        for (int i = 0; i < strings.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(strings.get(i));
            }
        }
    }
}

