package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    public int a;
    public int b;
    public int c;

    Solution() {
    }

    public Solution(int a) {
        this.a = a;
    }

    protected Solution(int a, int b) {
        this.a = a;
        this.b = b;
    }
    private Solution(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {

    }
}

