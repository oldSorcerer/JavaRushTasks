package com.javarush.task.task36.task3603;

import java.util.Arrays;
import java.util.List;

/* 
Поиск класса по описанию
*/

public class Solution {
    public static void main(String... args) {    //it's correct line
        ClassNameToBeReplaced<String> list = new ClassNameToBeReplaced();
        list.add("A");
        list.add("B");
        list.add("C");
        list.remove("B");
        List<String> collection = Arrays.asList(new String[]{"B", "C", "D", "B"});

        list.methodNameToBeReplaced(collection);

        for (String string : list) {
            System.out.println(string);
        }
        /* Expected output
A
C
B
D
         */
    }
}
