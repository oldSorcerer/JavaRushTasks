package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.command.ExitCommand;
import com.javarush.task.task31.task3110.exception.WrongZipFileException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;

import static com.javarush.task.task31.task3110.Operation.*;

public class Archiver {

    public static Operation askOperation() throws IOException {
        ConsoleHelper.writeMessage("Выберите операцию:\n" +
                                   "0 - упаковать файлы в архив\n" +
                                   "1 - добавить файл в архив\n" +
                                   "2 - удалить файл из архива\n" +
                                   "3 - распаковать архив\n" +
                                   "4 - просмотреть содержимое архива\n" +
                                   "5 - выход");

        int number = ConsoleHelper.readInt();

        if (number == CREATE.ordinal()) {
            return CREATE;
        } else if (number == ADD.ordinal()) {
            return ADD;
        } else if (number == REMOVE.ordinal()) {
            return REMOVE;
        }  else if (number == EXTRACT.ordinal()) {
            return EXTRACT;
        }  else if (number == CONTENT.ordinal()) {
            return CONTENT;
        }  else if (number == EXIT.ordinal()) {
            return EXIT;
        } else {
            return null;
        }
    }


    public static void main(String[] args) throws Exception {
//        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
//
//        System.out.println("Введите полный путь файла архива:");
//        ZipFileManager zipFileManager = new ZipFileManager(Paths.get(console.readLine()));
//
//        System.out.println("Введите полное имя файла для архивации:");
//        zipFileManager.createZip(Paths.get(console.readLine()));
//
//
//        ExitCommand exitCommand = new ExitCommand();
//        exitCommand.execute();

        Operation operation = null;
        while (operation != EXIT) {
            try {
                operation = askOperation();
                CommandExecutor.execute(operation);
            } catch (WrongZipFileException e) {
                ConsoleHelper.writeMessage("Вы не выбрали файл архива или выбрали неверный файл.");
            } catch (Exception e) {
                ConsoleHelper.writeMessage("Произошла ошибка. Проверьте введенные данные.");
            }
        }



    }
}
