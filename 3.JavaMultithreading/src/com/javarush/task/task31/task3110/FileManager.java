package com.javarush.task.task31.task3110;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class FileManager {
    Path rootPath;
    List<Path> fileList;

    public FileManager(Path rootPath) throws IOException {
        this.rootPath = rootPath;
        fileList = new ArrayList<>();
        collectFileList(rootPath);
    }

    private void collectFileList(Path path) throws IOException {
        if (Files.isRegularFile(path)) {
            fileList.add(rootPath.relativize(path));
        } else if (Files.isDirectory(path)) {
            try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path)) {
                for (Path file : directoryStream) {
                    collectFileList(file);
                }
            }
        }
    }
}
