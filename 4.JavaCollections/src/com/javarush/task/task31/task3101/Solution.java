package com.javarush.task.task31.task3101;

import java.io.*;
import java.nio.file.*;
import java.util.*;

/* 
Проход по дереву файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        File sourceDirectory = new File(args[0]);
        File resultFile = new File(args[1]);
        File allFilesContent = new File(resultFile .getParent() + "/allFilesContent.txt");

        if (FileUtils.isExist(allFilesContent)) {
            FileUtils.deleteFile(allFilesContent);
        }
        FileUtils.renameFile(resultFile , allFilesContent);

        try (OutputStream outputStream = new FileOutputStream(allFilesContent, true)) {
            List<File> list = new ArrayList<>();
            gatherFiles(sourceDirectory , list);
            for (File file : list) {
                if (file.length() <= 50L) {
                    outputStream.write(Files.readAllBytes(file.toPath()));
                    outputStream.write(System.lineSeparator().getBytes());
                }
            }
        }
    }


    private static void gatherFiles(File directory, List<File> fileList) {
        File[] files = directory.listFiles();

        if (Objects.isNull(files)) return;

        for (File file : files) {
            if (file.isDirectory()) {
                gatherFiles(file, fileList);
            } else {
                fileList.add(file);
            }
        }
    }
}
