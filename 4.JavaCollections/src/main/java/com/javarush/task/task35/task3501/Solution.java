package com.javarush.task.task35.task3501;

/* 
Вызов статического метода
*/

public class Solution {
    public static void main(String[] args) {
        Number number = GenericStatic.<Number>someStaticMethod(new Integer(3));
    }
}
