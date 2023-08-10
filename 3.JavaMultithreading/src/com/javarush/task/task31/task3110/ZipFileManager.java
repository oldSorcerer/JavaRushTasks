package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.exception.PathIsNotFoundException;
import com.javarush.task.task31.task3110.exception.WrongZipFileException;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ZipFileManager {

    Path zipFile;

    public ZipFileManager(Path zipFile) {
        this.zipFile = zipFile;
    }

    public void createZip(Path source) throws Exception {
        if (Files.notExists(zipFile.getParent())) {
            Files.createDirectory(zipFile.getParent());
        }
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(zipFile))) {
            if (Files.isRegularFile(source)) {
                addNewZipEntry(zipOutputStream, source.getParent(), source.getFileName());
            } else if (Files.isDirectory(source)) {
                FileManager fileManager = new FileManager(source);
                List<Path> fileNames = fileManager.getFileList();
                for (Path fileName : fileNames) {
                    addNewZipEntry(zipOutputStream, source, fileName);
                }
            } else {
                throw new PathIsNotFoundException();
            }
        }
    }

    private void addNewZipEntry(ZipOutputStream zipOutputStream, Path filePath, Path fileName) throws Exception {
        try (InputStream inputStream = Files.newInputStream(filePath.resolve(fileName))) {
            ZipEntry zipEntry = new ZipEntry(fileName.toString());
            zipOutputStream.putNextEntry(zipEntry);
            copyData(inputStream, zipOutputStream);
            zipOutputStream.closeEntry();
        }
    }

    private void copyData(InputStream in, OutputStream out) throws Exception {
        byte[] buffer = new byte[8 * 1024];
        int len;
        while ((len = in.read(buffer)) > 0) {
            out.write(buffer, 0, len);
        }
    }

    public List<FileProperties> getFilesList() throws Exception {
        if (!Files.isRegularFile(zipFile)) {
            throw new WrongZipFileException();
        }
        List<FileProperties> list = new ArrayList<>();
        try (ZipInputStream zipInputStream = new ZipInputStream(Files.newInputStream(zipFile))) {
            ZipEntry zipEntry;
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {

                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                copyData(zipInputStream, outputStream);

                list.add(new FileProperties(
                        zipEntry.getName(),
                        zipEntry.getSize(),
                        zipEntry.getCompressedSize(),
                        zipEntry.getMethod()));
            }
        }
        return list;
    }

    public void extractAll(Path outputFolder) throws Exception {
        if (!Files.isRegularFile(zipFile)) {
            throw new WrongZipFileException();
        }

        if (Files.notExists(outputFolder)) {
            Files.createDirectories(outputFolder);
        }

        try (ZipInputStream zipInputStream = new ZipInputStream(Files.newInputStream(zipFile))) {
            ZipEntry zipEntry;
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                Path path = outputFolder.resolve(zipEntry.getName());
                if (Files.isDirectory(path)) {
                    Files.createDirectories(path);
                } else if (path.getParent() != null && Files.notExists(path)) {
                    Files.createDirectories(path.getParent());
                    Files.createFile(path);
                    try (OutputStream outputStream = Files.newOutputStream(path)) {
                        copyData(zipInputStream, outputStream);
                    }
                }
            }
            zipInputStream.closeEntry();
        }
    }

    public void removeFiles(List<Path> pathList) throws Exception {
        if (!Files.isRegularFile(zipFile)) {
            throw new WrongZipFileException();
        }

        Path temp = Files.createTempFile("tmp", null);
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(temp));
             ZipInputStream zipInputStream = new ZipInputStream(Files.newInputStream(zipFile))) {
            ZipEntry zipEntry;
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                if (pathList.contains(Paths.get(zipEntry.getName()))) {
                    ConsoleHelper.writeMessage(String.format("Файл '%s' удален из архива.", zipEntry.getName()));
                } else {
                    zipOutputStream.putNextEntry(zipEntry);
                    copyData(zipInputStream, zipOutputStream);
                    zipInputStream.closeEntry();
                    zipOutputStream.closeEntry();
                }
            }
        }
        Files.move(temp, zipFile, StandardCopyOption.REPLACE_EXISTING);
    }

    public void removeFile(Path path) throws Exception {
        removeFiles(Collections.singletonList(path));
    }

    public void addFiles(List<Path> absolutePathList) throws Exception {
        if (!Files.isRegularFile(zipFile)) {
            throw new WrongZipFileException();
        }

        Path temp = Files.createTempFile("tmp", null);

        try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(temp));
             ZipInputStream zipInputStream = new ZipInputStream(Files.newInputStream(zipFile))) {
            ZipEntry zipEntry;
            List<Path> archivePathList = new ArrayList<>();
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                zipOutputStream.putNextEntry(zipEntry);
                copyData(zipInputStream, zipOutputStream);
                zipInputStream.closeEntry();
                zipOutputStream.closeEntry();
                archivePathList.add(Paths.get(zipEntry.getName()));
            }
            for (Path path : absolutePathList) {
                if (archivePathList.contains(path.getFileName())) {
                    ConsoleHelper.writeMessage(String.format("'%s' уже есть в архиве.", path));
                    continue;
                }
                if (Files.isDirectory(path)) {
                    FileManager fileManager = new FileManager(path);
                    List<Path> fileList = fileManager.getFileList();

                    for (Path file : fileList) {
                        Path resolve = path.getFileName().resolve(file);
                        if (archivePathList.contains(resolve.getFileName())) {
                            ConsoleHelper.writeMessage(String.format("'%s' уже есть в архиве.", resolve));
                            continue;
                        }
                        addNewZipEntry(zipOutputStream, path.getParent(), resolve);
                        ConsoleHelper.writeMessage(String.format("Файл '%s' добавлен в архив.", resolve));
                    }
                } else if (Files.isRegularFile(path)) {
                    addNewZipEntry(zipOutputStream, path.getParent(), path.getFileName());
                    ConsoleHelper.writeMessage(String.format("Файл '%s' добавлен в архив.", path.getFileName()));
                } else {
                    throw new PathIsNotFoundException();
                }
            }
        }
        Files.move(temp, zipFile, StandardCopyOption.REPLACE_EXISTING);
    }

    public void addFile(Path absolutePath) throws Exception {
        addFiles(Collections.singletonList(absolutePath));
    }
}