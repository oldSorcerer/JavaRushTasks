package com.javarush.task.jdk13.task38.task3804;

import java.lang.reflect.Field;

import static java.util.Objects.isNull;

public class Solution {

    public static void main(String[] args) throws Exception {
        printIfAnnotated(new User(28219, "Poulo", "poulo@javarush.co"));
        printIfAnnotated(new SocialUser(1, "Jackl", "jackl@javarush.co", "temp+7132293185974599@javarush.ru"));
    }

    public static void printIfAnnotated(Object instance) throws Exception {
        Entity entity = instance.getClass().getAnnotation(Entity.class);
        if (isNull(entity) || !entity.required()) {
            return;
        }

        System.out.println(entity.name() + ", " + entity.value());
        for (Field declaredField : instance.getClass().getDeclaredFields()) {
            declaredField.setAccessible(true);
            System.out.printf("\t%s: %s\n", declaredField.getName(), declaredField.get(instance));
        }
    }
}
