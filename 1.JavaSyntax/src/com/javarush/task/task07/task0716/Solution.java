package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<>();
        list.add("роза");
        list.add("лоза");
        list.add("лира");
        fix(list);


        for (String string : list) {
            System.out.println(string);
        }
    }

    public static void fix(ArrayList<String> list) {

        int size = list.size();
        for (int i = 0; i < size; i++) {
            if ((list.get(i).contains("р")) && (!list.get(i).contains("л"))) {
                list.remove(i);
                i--;
                size--;
            } else if ((!list.get(i).contains("р")) && (list.get(i).contains("л"))) {
                list.add(list.get(i));
            }
        }
    }
}
