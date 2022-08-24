package com.javarush.task.jdk13.task20.task2005;

import java.io.Serializable;

/* 
Как сериализовать что-то свое?
*/

public class Solution {
    public static int stringCount;

    public static void main(String[] args) {

    }

    public static class Object implements Serializable {
        public String string1;
        public String string2;
    }

    public static class String implements Serializable {
        private final int number;

        public String() {
            number = ++stringCount;
        }

        public void print() {
            System.out.println("string #" + number);
        }
    }
}
