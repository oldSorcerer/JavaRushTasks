package com.javarush.task.jdk13.task13.task1305;

/* 
Всё, что движется
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface CanMove {
        Double speed();
    }

    interface CanFly extends CanMove {
        Double speed(CanFly canFly);
    }
}