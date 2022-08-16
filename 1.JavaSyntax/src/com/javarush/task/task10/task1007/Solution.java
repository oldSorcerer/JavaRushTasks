package com.javarush.task.task10.task1007;

/* 
Задача №7 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {

        long l = 111_1111_111_110L;
//        System.out.println(l);
        int x = 0b1000_1100_1010;
//        System.out.println(x);
        double m = 110_987_654_6299.123_34;
//        System.out.println(m);
//        System.out.println((float) m);
        float f = l++ + 10 + ++x - (float) m;
//        System.out.println(l++ + 10 + ++x - m);
//        System.out.println(f);
        l = (long) f / 1000;
        System.out.println(l);
//        System.out.println("---");
//        System.out.println((byte) l++ + 1);
//        System.out.println(l++ + 1);
    }
}