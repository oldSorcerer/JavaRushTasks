package com.javarush.task.jdk13.task41.task4111;

import java.util.concurrent.TimeUnit;

public class VeryHeavyEntity implements Entity {
    private final int id;

    private VeryHeavyEntity(int id) {
        try {
            TimeUnit.SECONDS.sleep(30);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.id = id;
    }

    public static VeryHeavyEntity load(int id) {
        System.out.println("Происходит инициализация данных... Это может занять несколько минут...");
        VeryHeavyEntity entity = new VeryHeavyEntity(id);
        System.out.println("Инициализация данных завершена!");
        return entity;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String find(String query) {
        return "Nothing found.";
    }
}
