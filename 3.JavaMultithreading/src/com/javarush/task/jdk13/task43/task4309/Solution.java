package com.javarush.task.jdk13.task43.task4309;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* 
Какая операция 2
*/

public class Solution {

    public static void main(String[] args) {
        Set<Integer> setA = Set.of(435, 12, 56, 1, 9066);
        Set<Integer> setB = Set.of(1, 435, 12, 56, 11, 9067);
        System.out.println(compute(setA, setB));
    }

    public static Collection<Integer> compute(Set<Integer> setA, Set<Integer> setB) {
//        Set<Integer> result = new HashSet<>();
//        result.addAll(setA);
//        result.addAll(setB);
        return CollectionUtils.union(setA, setB);
    }
}
