package com.javarush.task.jdk13.task34.task3406;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.stream.Collectors;

/* 
Классные методы
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        print(getMethods(Set.of(Object.class, Math.class, Arrays.class)));
    }

    public static Map<Class<?>, Set<String>> getMethods(Set<Class<?>> classes) {
        return classes.stream().collect(Collectors.toMap(
                aClass -> aClass,
                aClass-> Arrays.stream(aClass.getDeclaredMethods())
                        .filter(method -> Modifier.isStatic(method.getModifiers()))
                        .map(Method::getName)
                        .collect(Collectors.toSet()),
                (a, b) -> b));
    }

    public static Map<Class<?>, Set<String>> getMethods1(Set<Class<?>> classes) {
        Map<Class<?>, Set<String>> map = new HashMap<>();

        for (Class<?> aClass : classes) {
            Set<String> set = new HashSet<>();
            for (Method method : aClass.getDeclaredMethods()) {
                if (Modifier.isStatic(method.getModifiers())) {
                    set.add(method.getName());
                }
            }
            map.put(aClass, set);
        }
        return map;
    }

    public static void print(Map<?, ?> map) {
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
