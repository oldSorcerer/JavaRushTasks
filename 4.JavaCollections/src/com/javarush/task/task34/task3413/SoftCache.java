package com.javarush.task.task34.task3413;

import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class SoftCache {
    private final Map<Long, SoftReference<AnyObject>> cacheMap = new ConcurrentHashMap<>();

    public AnyObject get(Long key) {
        SoftReference<AnyObject> softReference = cacheMap.get(key);

        return cacheMap.containsKey(key) ? softReference.get() : null;
    }

    public AnyObject put(Long key, AnyObject value) {
        SoftReference<AnyObject> softReference = cacheMap.put(key, new SoftReference<>(value));

        if (Objects.isNull(softReference)) {
            return null;
        }

        AnyObject oldValue = softReference.get();
        softReference.clear();
        return oldValue;
    }

    public AnyObject remove(Long key) {
        SoftReference<AnyObject> softReference = cacheMap.remove(key);

        if (Objects.isNull(softReference)) {
            return null;
        }

        AnyObject oldValue = softReference.get();
        softReference.clear();
        return oldValue;
    }
}