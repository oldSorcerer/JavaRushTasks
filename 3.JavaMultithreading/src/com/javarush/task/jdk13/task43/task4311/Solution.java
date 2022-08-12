package com.javarush.task.jdk13.task43.task4311;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* 
Какая операция 4
*/

public class Solution {

    public static void main(String[] args) {
        Set<Integer> setA = Set.of(435, 12, 56, 1, 9066);
        Set<Integer> setB = Set.of(1, 435, 12, 56, 11, 9067);
        System.out.println(compute(setA, setB));
    }

    public static Collection<Integer> compute(Set<Integer> setA, Set<Integer> setB) {
        Set<Integer> result = new HashSet<>();
        for (Integer i : setA) {
            if (!setB.contains(i)) {
                result.add(i);
            }
        }
        for (Integer i : setB) {
            if (!setA.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}
