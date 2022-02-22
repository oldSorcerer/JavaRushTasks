package com.javarush.task.pro.task18.task1805;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length() ;
    }
}
