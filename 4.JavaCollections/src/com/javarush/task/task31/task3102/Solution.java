package com.javarush.task.task31.task3102;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

/* 
Находим все файлы
*/

public class Solution {

    public static List<String> getFileTree(String root) throws IOException {
        List<String> list = new ArrayList<>();
        Queue<Path> queue = new ArrayDeque<>();
        queue.add(Paths.get(root));
        while (!queue.isEmpty()) {
            Path path = queue.poll();
            try (DirectoryStream<Path> paths = Files.newDirectoryStream(path)) {
                for (Path entry : paths) {
                    if (Files.isRegularFile(entry)) {
                        list.add(entry.toString());
                    } else if (Files.isDirectory(entry)) {
                        queue.add(entry);
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) throws IOException {
        String path = "D:\\TheProjects\\IdeaProjects\\JavaRushTasks";
        getFileTree(path).forEach(System.out::println);
        System.out.println(getFileTree(path).size());
    }

    public static List<String> getFileTreeRec(String root) {
        List<String> list = new ArrayList<>();

        try (DirectoryStream<Path> paths = Files.newDirectoryStream(Paths.get(root))) {
            for (Path path : paths) {
                if (Files.isRegularFile(path)) {
                    list.add(path.toString());
                } else if (Files.isDirectory(path)) {
                    list.addAll(getFileTree(path.toString()));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
