package com.javarush.task.task31.task3105;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Добавление файла в архив
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);

        Map<String, ByteArrayOutputStream> map = getStringByteArrayOutputStreamMap(args[1]);

        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(args[1]))) {
            zipOutputStream.putNextEntry(new ZipEntry("new/" + file.getName()));
            Files.copy(file.toPath(), zipOutputStream);

            for (Map.Entry<String, ByteArrayOutputStream> entry : map.entrySet()) {
                if (!entry.getKey().equals("new/" + file.getName())) {
                    ZipEntry zipEntry = new ZipEntry(entry.getKey());
                    zipOutputStream.putNextEntry(zipEntry);
                    zipOutputStream.write(entry.getValue().toByteArray());
                    zipOutputStream.closeEntry();
                }
            }
        }
    }

    private static Map<String, ByteArrayOutputStream> getStringByteArrayOutputStreamMap(String zipFilePath) throws IOException {
        Map<String, ByteArrayOutputStream> map = new HashMap<>();

        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFilePath))) {
            ZipEntry zipEntry;
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                for (int length; (length = zipInputStream.read(buffer)) > 0; ) {
                    byteArrayOutputStream.write(buffer, 0, length);
                }
                map.put(zipEntry.getName(), byteArrayOutputStream);
            }
        }
        return map;
    }
}
