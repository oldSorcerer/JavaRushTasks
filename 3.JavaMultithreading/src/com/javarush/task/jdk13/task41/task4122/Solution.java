package com.javarush.task.jdk13.task41.task4122;

/* 
Memento mori
*/

public class Solution {

    public static void main(String[] args) {
        Notepad notepad = new Notepad(new TextWindow());
        notepad.write("Шаблон проектирования Хранитель.\n");
        notepad.write("Как его применять в Java?\n");
        notepad.save();

        notepad.write("Возьмите 300г муки, 0.5л молока и 2 яйца...\n");

        notepad.undo();

        System.out.println(notepad.print());
    }
}
