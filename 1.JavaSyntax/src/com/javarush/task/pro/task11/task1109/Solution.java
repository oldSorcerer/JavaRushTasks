package com.javarush.task.pro.task11.task1109;

/* 
Объекты внутренних и вложенных классов
*/

public class Solution {
    public static void main(String[] args) {
        //Outer outer = new Outer();
        //outer.new Inner();
        Outer.Nested outerNested = new Outer.Nested();
        Outer.Inner outerInner = new Outer().new Inner();
    }
}
