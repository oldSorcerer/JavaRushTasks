package com.javarush.task.task33.task3310.strategy;

import java.util.Arrays;

public class OurHashMapStorageStrategy implements StorageStrategy{

    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

    private Entry[] table = new Entry[DEFAULT_INITIAL_CAPACITY];

    private int size;

    private int threshold = (int) (DEFAULT_INITIAL_CAPACITY * DEFAULT_LOAD_FACTOR);

    private float loadFactor = DEFAULT_LOAD_FACTOR;

    public int hash(Long k) {
        int h;
        return (k == null) ? 0 : (h = k.hashCode()) ^ (h >>> 16);
    }

    public int indexFor(int hash, int length) {
        return 0;
    }

    public Entry getEntry(Long key) {
//        return Arrays.stream(table).filter(entry -> entry.getKey().equals(key)).findFirst().orElse(null);
        return null;
    }

    public void resize(int newCapacity) {

    }

    public void transfer(Entry[] newTable) {

    }

    public void addEntry(int hash, Long key, String value, int bucketIndex) {

    }

    public void createEntry(int hash, Long key, String value, int bucketIndex) {

    }

    @Override
    public boolean containsKey(Long key) {
        return false;
    }

    @Override
    public boolean containsValue(String value) {
        return false;
    }

    @Override
    public void put(Long key, String value) {

    }

    @Override
    public Long getKey(String value) {
        return null;
    }

    @Override
    public String getValue(Long key) {
        return null;
    }
}
