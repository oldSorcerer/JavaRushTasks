package com.javarush.task.jdk13.task41.task4116;

/* 
Шерсть и звезды
*/

import com.javarush.task.jdk13.task41.task4116.animals.*;
import com.javarush.task.jdk13.task41.task4116.visitor.JsonExportVisitor;
import com.javarush.task.jdk13.task41.task4116.visitor.YamlExportVisitor;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Cat().accept(new JsonExportVisitor()));
        System.out.println(new Cow().accept(new JsonExportVisitor()));
        System.out.println(new Dog().accept(new JsonExportVisitor()));

        System.out.println(new Cat().accept(new YamlExportVisitor()));
        System.out.println(new Cow().accept(new YamlExportVisitor()));
        System.out.println(new Dog().accept(new YamlExportVisitor()));
    }
}
