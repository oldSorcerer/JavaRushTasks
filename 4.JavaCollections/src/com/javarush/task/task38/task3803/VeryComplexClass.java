package com.javarush.task.task38.task3803;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Runtime исключения (unchecked exception)
*/

public class VeryComplexClass {
    public void methodThrowsClassCastException() {
        String string = (String) new Object();
    }

    public void methodThrowsNullPointerException() {
        Object object = null;
        int i = object.hashCode();
    }

    public static void main(String[] args) {

    }
}
