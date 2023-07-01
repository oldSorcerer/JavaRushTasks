package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.exception.WrongZipFileException;

import java.io.IOException;

public class Archiver {

    public static Operation askOperation() throws IOException {
        ConsoleHelper.writeMessage("Выберите операцию:\n" +
                                   "0 - упаковать файлы в архив\n" +
                                   "1 - добавить файл в архив\n" +
                                   "2 - удалить файл из архива\n" +
                                   "3 - распаковать архив\n" +
                                   "4 - просмотреть содержимое архива\n" +
                                   "5 - выход");

        return Operation.values()[ConsoleHelper.readInt()];
    }

    public static void main(String[] args) {

        Operation operation = null;
        while (operation != Operation.EXIT) {
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
