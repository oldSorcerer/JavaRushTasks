package com.javarush.task.task06.task0602;

/* 
Пустые кошки, пустые псы
*/

public class Cat {
    public static void main(String[] args) {

    }

    protected void finalize() throws Throwable {
        System.out.println("Cat was destroyed");
    }
}

class Dog {
    protected void finalize() throws Throwable {
        System.out.println("Dog was destroyed");
    }
}