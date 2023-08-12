package com.javarush.task.task33.task3310.strategy;

import java.util.HashMap;

public class HashMapStorageStrategy implements StorageStrategy {

    private HashMap<Long, String> data = new HashMap<>();

    @Override
    public boolean containsKey(Long key) {
        return data.containsKey(key);
    }

    @Override
    public boolean containsValue(String value) {
        return data.containsValue(value);
    }

    @Override
    public void put(Long key, String value) {
        data.put(key, value);
    }

    @Override
    public Long getKey(String value) {
//        return data.keySet().stream().filter(key -> data.get(key).equals(value)).findFirst().get();
        return data.entrySet().stream().filter(entry -> entry.getValue().equals(value)).findFirst().get().getKey();
    }

    @Override
    public String getValue(Long key) {
        return data.get(key);
    }
}
