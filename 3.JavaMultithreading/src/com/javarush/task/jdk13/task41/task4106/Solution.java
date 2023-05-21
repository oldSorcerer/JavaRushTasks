package com.javarush.task.jdk13.task41.task4106;

/* 
Вселенная под ключ
*/

public class Solution {

    public static void main(String[] args) {
        Universe universe = Universe.getInstance();
        Universe anotherUniverse = Universe.getInstance();
        System.out.println(universe);
        System.out.println(anotherUniverse);
    }
}
