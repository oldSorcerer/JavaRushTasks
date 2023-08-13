package com.javarush.task.task33.task3310;

import com.javarush.task.task33.task3310.strategy.HashMapStorageStrategy;
import com.javarush.task.task33.task3310.strategy.StorageStrategy;

import java.util.Date;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Solution {

    public static Set<Long> getIds(Shortener shortener, Set<String> strings) {
        return strings.stream().map(shortener::getId).collect(Collectors.toSet());
    }

    public static Set<String> getStrings(Shortener shortener, Set<Long> keys) {
        return keys.stream().map(shortener::getString).collect(Collectors.toSet());
    }

    public static void testStrategy(StorageStrategy strategy, long elementsNumber) {
        Helper.printMessage(strategy.getClass().getSimpleName());

        Set<String> set = LongStream.range(0, elementsNumber).mapToObj(e -> Helper.generateRandomString()).collect(Collectors.toSet());
        Shortener shortener = new Shortener(strategy);

        long timeStart = new Date().getTime();
        Set<Long> ids = getIds(shortener, set);
        long timeEnd = new Date().getTime();
        long time = timeEnd - timeStart;
        Helper.printMessage("Время получения идентификаторов для " + elementsNumber + " строк: " + time + " мс.");

        timeStart = new Date().getTime();
        Set<String> strings = getStrings(shortener, ids);
        timeEnd = new Date().getTime();
        time = timeEnd - timeStart;
        Helper.printMessage("Время получения идентификаторов для " + elementsNumber + " строк: " + time + " мс.");

        Helper.printMessage( "Тест " + (set.containsAll(strings) ? "" : "не ") + "пройден.");

    }

    public static void main(String[] args) {
        testStrategy(new HashMapStorageStrategy(), 10_000L);
    }
}
