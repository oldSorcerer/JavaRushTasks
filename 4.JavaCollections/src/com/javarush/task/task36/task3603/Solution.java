package com.javarush.task.task36.task3603;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* 
Поиск класса по описанию
*/

public class Solution {
    public static void main(String... args) {    //it's correct line
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.remove("B");
        List<String> collection = Arrays.asList("B", "C", "D", "B");

        list.addAllAbsent(collection);

        for (String string : list) {
            System.out.println(string);
        }
    }
}
/* Expected output
A
C
B
D
*/
