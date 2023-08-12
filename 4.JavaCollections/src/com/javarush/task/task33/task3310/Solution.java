package com.javarush.task.task33.task3310;

import com.javarush.task.task33.task3310.strategy.StorageStrategy;

import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {

    }

    public Set<Long> getIds(Shortener shortener, Set<String> strings) {
        return strings.stream().map(shortener::getId).collect(Collectors.toSet());
    }

    public Set<String> getStrings(Shortener shortener, Set<Long> keys) {
       return null;
    }

    public void testStrategy(StorageStrategy strategy, long elementsNumber) {

    }
}
