package com.javarush.task.task28.task2811;

import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteMap<K, V> {
    private final Map<K, V> map;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
//    private final Lock readLock;
//    private final Lock writeLock;

    public ReadWriteMap(Map<K, V> map) {
        this.map = map;
    }

    public V put(K key, V value) {
        try {
            return map.put(key, value);
        } finally {

        }
    }

    public V get(K key) {
        try {
            return map.get(key);
        } finally {

        }
    }
}
