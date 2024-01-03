package com.javarush.task.task31.task3112;

import org.apache.logging.log4j.core.appender.rolling.action.IfAccumulatedFileCount;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/* 
Загрузчик файлов
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        if (Files.notExists(downloadDirectory)){
            Files.createDirectory(downloadDirectory);
        }

        URL url = new URL(urlString);
        String fileName = Paths.get(url.getPath()).getFileName().toString();

        Path download = downloadDirectory.resolve(fileName);

        InputStream inputStream = url.openStream();

        Path tempFile = Files.createTempFile("temp-", ".temp");
        Files.copy(inputStream, tempFile, StandardCopyOption.REPLACE_EXISTING);
        Files.move(tempFile, download, StandardCopyOption.REPLACE_EXISTING);
        return download;
    }
}
