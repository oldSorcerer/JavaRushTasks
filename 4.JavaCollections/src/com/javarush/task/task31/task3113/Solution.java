package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Что внутри папки?
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Path directory = Paths.get(reader.readLine());
        if (Files.isRegularFile(directory)) {
            System.out.println(directory + " - не папка");
            return;
        }
        long folderCount = 0;
        long fileCount = 0;
        long size = 0;

        try (Stream<Path> walk = Files.walk(directory)) {
            Set<Path> set = walk.collect(Collectors.toSet());
            set.remove(directory);
            for (Path path : set) {
                if (Files.isDirectory(path)) {
                    folderCount++;
                } else if (Files.isRegularFile(path)) {
                    fileCount++;
                    size += Files.size(path);
                }
            }
        }

        System.out.println("Параметры папки " + directory + ":");
        System.out.println("Всего папок - " + folderCount);
        System.out.println("Всего файлов - " + fileCount);
        System.out.println("Общий размер - " + size + " байт");
    }

    public static void main1(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Path directory = Paths.get(reader.readLine());
        if (Files.isRegularFile(directory)) {
            System.out.println(directory + " - не папка");
            return;
        }
        AtomicLong folderCount = new AtomicLong();
        AtomicLong fileCount = new AtomicLong();
        AtomicLong size = new AtomicLong();

        Files.walkFileTree(directory, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                if (!dir.equals(directory)) folderCount.incrementAndGet();
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                fileCount.incrementAndGet();
                size.addAndGet(attrs.size());
                return FileVisitResult.CONTINUE;
            }
        });

        System.out.println("Параметры папки " + directory + ":");
        System.out.println("Всего папок - " + folderCount.get());
        System.out.println("Всего файлов - " + fileCount.get());
        System.out.println("Общий размер - " + size.get() + " байт");
    }
}
