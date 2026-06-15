package com.javarush.task.task33.task3310;

import com.javarush.task.task33.task3310.strategy.HashMapStorageStrategy;
import com.javarush.task.task33.task3310.strategy.StorageStrategy;

import java.util.Date;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Solution {
    public static void main(String[] args) {
        long elementsNumber = 10_000;
        testStrategy(new HashMapStorageStrategy(), elementsNumber);

    }

    public static Set<Long> getIds(Shortener shortener, Set<String> strings) {
        return strings.stream()
                .map(shortener::getId)
                .collect(Collectors.toSet());
    }

    public static Set<String> getStrings(Shortener shortener, Set<Long> keys) {
        return keys.stream()
                .map(shortener::getString)
                .collect(Collectors.toSet());
    }

    public static void testStrategy(StorageStrategy strategy, long elementsNumber) {
        Helper.printMessage(strategy.getClass().getSimpleName());

        Set<String> set = LongStream.range(0, elementsNumber)
                .mapToObj(i -> Helper.generateRandomString())
                .collect(Collectors.toSet());

        Shortener shortener = new Shortener(strategy);

        Date startTimestamp = new Date();
        Set<Long> ids = getIds(shortener, set);
        Date endTimestamp = new Date();

        long time = endTimestamp.getTime() - startTimestamp.getTime();
        Helper.printMessage("Время получения идентификаторов для " + elementsNumber + " строк: " + time);


        startTimestamp = new Date();
        Set<String> strings = getStrings(shortener, ids);
        endTimestamp = new Date();

        time = endTimestamp.getTime() - startTimestamp.getTime();
        Helper.printMessage("Время получения строк для " + elementsNumber + " идентификаторов: " + time);

        Helper.printMessage(set.containsAll(strings) ? "Тест пройден." : "Тест не пройден.");

    }
}
