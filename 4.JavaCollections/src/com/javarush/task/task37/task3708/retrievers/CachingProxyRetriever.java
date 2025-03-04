package com.javarush.task.task37.task3708.retrievers;

import com.javarush.task.task37.task3708.cache.LRUCache;
import com.javarush.task.task37.task3708.storage.Storage;

public class CachingProxyRetriever implements Retriever {


    private final OriginalRetriever originalRetriever;
    private final LRUCache<Long, Object> lruCache = new LRUCache<>(10);

    public CachingProxyRetriever(Storage storage) {
        originalRetriever = new OriginalRetriever(storage);
    }

    @Override
    public Object retrieve(long id) {

        if (lruCache.find(id) == null) {
            Object retrieve = originalRetriever.retrieve(id);
            lruCache.set(id, retrieve);
            return retrieve;
        } else {
            return lruCache.find(id);
        }
    }

}
