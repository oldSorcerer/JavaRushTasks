package com.javarush.task.task31.task3106;

import java.io.*;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/*
Разархивируем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //Файл результата, по совместительству имя этого файла мы ищем в архиве
        File result = new File(args[0]);
        if (!result.exists()) {
            result.createNewFile();
        }

        //Расставляем имена файлов архива в нужном нам порядке
        List<String> fileNames = new ArrayList<>(Arrays.asList(args).subList(1, args.length));
        fileNames.sort(Comparator.naturalOrder());

        //Список входящих стримов из разных кусков архива
        List<FileInputStream> fileInputStreams = new ArrayList<>();

        //Создаем входящий стрим для каждого куска архива
        for (String name : fileNames) {
            fileInputStreams.add(new FileInputStream(name));
        }

        //Входящий стрим общего архива
        try (ZipInputStream zipInputStream = new ZipInputStream(new SequenceInputStream(Collections.enumeration(fileInputStreams)))) {
            while (true) {
                ZipEntry entry = zipInputStream.getNextEntry();
                if (entry == null) break;

                try (OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(result))) {
                    final int bufferSize = 1024;
                    byte[] buffer = new byte[bufferSize];
                    for (int readBytes; (readBytes = zipInputStream.read(buffer, 0, bufferSize)) > -1; ) {
                        outputStream.write(buffer, 0, readBytes);
                    }
                    outputStream.flush();
                }
            }
        }
    }
}