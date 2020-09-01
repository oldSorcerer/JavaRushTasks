package com.javarush.task.task02.task0219;

/* 
Печатаем трижды
*/
public class Solution {
    public static void print3(String s) {
        System.out.print(s +" ");
        System.out.print(" "+ s +" ");
        System.out.print(" "+ s + " ");

    }

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}