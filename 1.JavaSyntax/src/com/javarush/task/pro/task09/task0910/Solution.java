package com.javarush.task.pro.task09.task0910;

/* 
Кодировка Unicode
*/

public class Solution {
    public static void main(String[] args) {
        char[] symbols = new char[9];
        init(symbols);
        System.out.println(new String(symbols));
    }

    public static void init(char[] symbols) {
        symbols[0] = '\u00A9';
        symbols[1] = '\u004A';
        symbols[2] = '\u0061';
        symbols[3] = '\u0076';
        symbols[4] = '\u0061';
        symbols[5] = '\u0052';
        symbols[6] = '\u0075';
        symbols[7] = '\u0073';
        symbols[8] = '\u0068';
    }
}
