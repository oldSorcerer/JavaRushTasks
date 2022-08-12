package com.javarush.task.jdk13.task42.task4208;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
Потоки в очередь!
*/

public class MyQueue extends AbstractQueue<String> {

    private final List<String> values = new ArrayList<>();

    @Override
    public Iterator<String> iterator() {
        return values.listIterator();
    }

    @Override
    public int size() {
        return values.size();
    }

    @Override
    public boolean offer(String o) {
        values.add(o);
        return true;
    }

    @Override
    public String poll() {
        return values.size() > 0 ? values.remove(0) : null;
    }

    @Override
    public String peek() {
        return values.size() > 0 ? values.get(0) : null;
    }
}
