package com.javarush.task.task33.task3310.strategy;

public interface StorageStrategy {

    boolean containsKey(Long key);

    boolean containsValue(String value);

    void put(Long key, String value);

    Long getKey(String value);

    String getValue(Long key);

}
