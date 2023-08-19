package com.javarush.task.task37.task3708;

import com.javarush.task.task37.task3708.retrievers.CachingProxyRetriever;
import com.javarush.task.task37.task3708.retrievers.OriginalRetriever;
import com.javarush.task.task37.task3708.retrievers.Retriever;
import com.javarush.task.task37.task3708.storage.RemoteStorage;
import com.javarush.task.task37.task3708.storage.Storage;

/* 
Кеширующий Proxy
*/

public class Solution {
    private static final int n = 10;

    public static void main(String[] args) {
        Storage storage = new RemoteStorage();

        fillStorage(storage);

        System.out.println("Testing OriginalRetriever: ");
        testRetriever(new OriginalRetriever(storage));

        System.out.println("\n\n\n\n\n\n\n\n\n\nTesting CachingProxyRetriever: ");
        testRetriever(new CachingProxyRetriever(storage));
    }

    private static void fillStorage(Storage storage) {
        for (int i = 0; i < n; i++) {
            storage.add("Resource #" + i);
        }
    }

    private static void testRetriever(Retriever retriever) {
        for (int i = 0; i < n * 4; i++) {
            System.out.println("Loaded value : " + retriever.retrieve((long) (Math.random() * n)));
        }
    }
}
