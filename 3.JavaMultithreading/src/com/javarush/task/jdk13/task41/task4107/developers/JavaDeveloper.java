package com.javarush.task.jdk13.task41.task4107.developers;

public class JavaDeveloper implements Developer {
    public void study() {
        System.out.println("Набирается компьютерной грамотности...");
        System.out.println("Учит английский язык...");
        System.out.println("Изучает джаву...");
        writeCode();
        System.out.println("Изучает паттерны...");
        writeCode();
        System.out.println("Знакомится с лучшими практиками...");
        writeCode();
        System.out.println("Изучает базы данных...");
        writeCode();
        System.out.println("Знакомится с популярными фреймворками...");
        writeCode();
    }

    public void writeCode() {
        System.out.println("Пишет какой-то код...");
    }
}
