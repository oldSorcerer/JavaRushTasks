package com.javarush.task.pro.task08.task0822;

/* 
Растянутые во времени и пространства
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(changeBit(0b101, 0b10, true)); // 111 (7)
        System.out.println(changeBit(0b110, 0b1, true)); // 111 (7)
        System.out.println(changeBit(0b1001, 0b1000, true)); // 1001 (9)

        System.out.println(changeBit(0b10011, 0b10000, false)); // 11 (3)
        System.out.println(changeBit(0b111111, 0b100, false)); // 111011 (59)
        System.out.println(changeBit(0b10101010, 0b100000, false)); // 10001010 (138)
    }

    public static int changeBit(int number, int bit, boolean activate) {
        return activate ? number | bit : number & (~bit);
    }
}
