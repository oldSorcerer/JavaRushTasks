package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> a = new ArrayList<>();
        int[] ints1 = {1, 1, 2, 3, 4};
        int[] ints2 = {1, 1};
        int[] ints3 = {1, 1, 2, 3};
        int[] ints4 = {1, 1, 2, 3, 4, 3, 4};
        int[] ints5 = {};
        a.add(ints1);
        a.add(ints2);
        a.add(ints3);
        a.add(ints4);
        a.add(ints5);
        return a;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}