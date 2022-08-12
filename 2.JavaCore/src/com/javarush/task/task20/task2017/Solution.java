package com.javarush.task.task20.task2017;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* 
Десериализация
*/

public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream) {
        try {
            return (A) objectStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static class A implements Serializable {

    }

    public static class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
