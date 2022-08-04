package com.javarush.task.task08.task0808;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
10 тысяч удалений и вставок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List<String> list) {
        for (int i = 0; i < 10_000; i++) {
            list.add(" ");
        }
    }

    public static void get10000(List<String> list) {
        for (int i = 0; i < 10_000; i++) {
            String str = list.get(0);
        }
    }

    public static void set10000(List<String> list) {
        for (int i = 0; i < 10_000; i++) {
            list.set(0, " ");
        }
    }

    public static void remove10000(List<String> list) {
        for (int i = 0; i < 10000; i++) {
            list.remove(0);
        }
    }
}