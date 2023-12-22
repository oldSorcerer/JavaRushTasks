package com.javarush.task.jdk13.task42.task4208;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* 
Потоки в очередь!
*/

public class MyQueue extends AbstractQueue<String> {

    private final List<String> values = new ArrayList<>();
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private Lock writeLock = lock.writeLock();
    private Lock readLock = lock.readLock();


    @Override
    public Iterator<String> iterator() {
        return values.listIterator();
    }

    @Override
    public int size() {
        try {
            lock.readLock();
            return values.size();
        } finally {
            readLock.unlock();
        }
    }

    @Override
    public boolean offer(String o) {
        values.add(o);
        return true;
    }

    @Override
    public String poll() {
        return !values.isEmpty() ? values.remove(0) : null;
    }

    @Override
    public String peek() {
        return !values.isEmpty() ? values.get(0) : null;
    }
}
