package com.javarush.task.task18.task1809;

import org.apache.commons.lang3.ArrayUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.IntStream;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        List<Integer> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine());
             FileOutputStream outputStream = new FileOutputStream(reader.readLine())
        ) {
            while (inputStream.available() > 0) {
                int read = inputStream.read();
                list.add(read);
            }
            Collections.reverse(list);
            for (Integer integer : list) {
                outputStream.write(integer);
            }
        }
    }

    public static void main1(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        byte[] buffer = Files.readAllBytes(Path.of(scanner.nextLine()));

        Files.write(Path.of(scanner.nextLine()),
                ArrayUtils.toPrimitive(
                        IntStream.range(0, buffer.length)
                                .boxed()
                                .map(i -> buffer[i])
                                .sorted(Comparator.reverseOrder())
                                .toArray(Byte[]::new)));
    }

    public static void main2(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        byte[] buffer = Files.readAllBytes(Path.of(scanner.nextLine()));

        ArrayUtils.reverse(buffer);
        Files.write(Path.of(scanner.nextLine()), buffer);
    }
}