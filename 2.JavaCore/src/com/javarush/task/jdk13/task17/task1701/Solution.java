package com.javarush.task.jdk13.task17.task1701;

import java.util.ArrayList;
import java.util.List;

/* 
Заметки
*/

public class Solution {
    public static void main(String[] args) {
//        new NoteThread().start();
//        new NoteThread().start();
    }

    public static class Note {

        public static final List<String> NOTES = new ArrayList<>();

        public static void addNote(String note) {
            NOTES.add(0, note);
        }

        public static void removeNote(String threadName) {
            String note = NOTES.remove(0);
            if (note == null) {
                System.out.println("Другая нить удалила нашу заметку");
            } else if (!note.startsWith(threadName)) {
                System.out.println("Нить [" + threadName + "] удалила чужую заметку [" + note + "]");
            } else {
                System.out.println("Нить [" + threadName + "] удалила свою заметку [" + note + "]");
            }
        }
    }
}
