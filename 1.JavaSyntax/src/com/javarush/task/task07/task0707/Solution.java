package com.javarush.task.task07.task0707;

import java.util.ArrayList;
import java.util.List;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();

        list.add("as");
        list.add("ad");
        list.add("af");
        list.add("ag");
        list.add("ah");

        System.out.println(list.size());

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}