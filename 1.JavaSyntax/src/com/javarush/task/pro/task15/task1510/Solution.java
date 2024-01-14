package com.javarush.task.pro.task15.task1510;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Пишем байты в файл
*/

public class Solution {
    public static void main(String[] args) {
        byte[] bytes = args[0].getBytes();
        try (Scanner scanner = new Scanner(System.in)) {
            Files.write(Path.of(scanner.nextLine()), bytes);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

