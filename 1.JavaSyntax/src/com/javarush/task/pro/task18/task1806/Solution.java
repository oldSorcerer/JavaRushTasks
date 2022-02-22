package com.javarush.task.pro.task18.task1806;

import java.util.ArrayList;
import java.util.Collections;

/* 
Знакомство с foreach
*/

public class Solution {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        print(numbers);
    }

    public static void print(ArrayList<Integer> numbers) {
        numbers.forEach(i -> System.out.println(i));

    }
}
