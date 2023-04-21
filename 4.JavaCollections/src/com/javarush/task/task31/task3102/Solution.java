package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

/* 
Находим все файлы
*/

public class Solution {
    private static final List<String> list = new ArrayList<>();

    public static List<String> getFileTree(String root) throws IOException {
        DirectoryStream<Path> paths = Files.newDirectoryStream(Path.of(root));
        for (Path path : paths) {
            if (Files.isRegularFile(path)) {
                list.add(path.toString());
            } else if (Files.isDirectory(path)) {
                getFileTree(path.toString());
            }
        }
        return list;
    }

    public static void main(String[] args) throws IOException {
        String path = "D:\\TheProjects\\IdeaProjects\\JavaRushTasks";
        getFileTree(path).forEach(System.out::println);
    }
}
