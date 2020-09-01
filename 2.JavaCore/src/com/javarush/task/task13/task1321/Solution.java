package com.javarush.task.task13.task1321;


/* 
Исправление ошибок Ӏ Java Core: 3 уровень, 11 лекция
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(Dream.HOBBY.toString());
        System.out.println(Hobby.INDEX);
    }

    interface Desire {
    }

    interface Dream  {
        Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
