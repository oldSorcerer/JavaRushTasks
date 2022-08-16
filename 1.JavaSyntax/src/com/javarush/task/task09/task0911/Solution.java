package com.javarush.task.task09.task0911;

import java.util.HashMap;

/* 
Исключение при работе с коллекциями Map
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            HashMap<String, String> map = new HashMap<>(null);
            map.put(null, null);
            map.remove(null);
        } catch (NullPointerException p) {
            System.out.print("NullPointerException");
        }
    }
}