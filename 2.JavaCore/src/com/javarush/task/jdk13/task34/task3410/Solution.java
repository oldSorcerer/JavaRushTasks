package com.javarush.task.jdk13.task34.task3410;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* 
Обнуление объекта
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        User user = new User(28219, "Paulo", 40, 9999, "paulo@javarush.com");
        System.out.println(user);
        reset(user);
        System.out.println(user);
    }

    public static void reset(Object object) throws Exception {
        for (Field field : object.getClass().getDeclaredFields()) {
            if (Modifier.isPrivate(field.getModifiers()) &&
                !Modifier.isStatic(field.getModifiers()) &&
                !field.getType().isPrimitive()) {
                field.setAccessible(true);
                field.set(object, null);
            }
        }
    }

//    @SneakyThrows
//    private static void fieldSetObjectValue(Field field, Object object, Object value) {
//        field.set(object, value);
//    }
//
//    public static void reset(Object object) {
//        Arrays.stream(object.getClass().getDeclaredFields())
//                .filter(field -> Modifier.isPrivate(field.getModifiers()) &&
//                                 !Modifier.isStatic(field.getModifiers()) &&
//                                 !field.getType().isPrimitive())
//                .peek(field -> field.setAccessible(true))
//                .forEach(field -> fieldSetObjectValue(field, object, null));
//    }
}
