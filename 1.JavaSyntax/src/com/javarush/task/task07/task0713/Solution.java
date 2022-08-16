package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            if ((list.get(i) % 3 == 0) || (list.get(i) % 2 == 0)) {
                if (list.get(i) % 3 == 0)
                    list1.add(list.get(i));
                if (list.get(i) % 2 == 0)
                    list2.add(list.get(i));
            } else
                list3.add(list.get(i));
        }

        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(List<Integer> list) {
        for (Integer r : list) {
            System.out.println(r);
        }
    }
}