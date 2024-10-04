package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.*;

/* 
Построй дерево(1)
*/

public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {

    Entry<String> root;
    int size;

    public CustomTree() {
        this.root = new Entry<>(null);
        this.size = 0;
    }

    @Override
    public boolean add(String elementName) {
        Entry<String> newEntry = new Entry<>(elementName);

        Entry<String> parent = findParent();

        if (parent == null) {
            return false;
        }

        if (parent.availableToAddLeftChildren) {
            parent.leftChild = newEntry;
            parent.availableToAddLeftChildren = false;
        } else if (parent.availableToAddRightChildren) {
            parent.rightChild = newEntry;
            parent.availableToAddRightChildren = false;
        }

        newEntry.parent = parent;
        size++;

        return true;
    }

    private Entry<String> findParent() {
        Queue<Entry<String>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Entry<String> current = queue.poll();
            if (current.isAvailableToAddChildren()) {
                return current;
            }
            if (current.leftChild != null) queue.add(current.leftChild);
            if (current.rightChild != null) queue.add(current.rightChild);
        }
        return null;
    }

    public String getParent(String string) {
        return getParent(root, string);
    }

    private String getParent(Entry<String> entry, String element) {
        if (entry == null) return null;

        if (entry.leftChild != null && entry.leftChild.elementName.equals(element)
            || entry.rightChild != null && entry.rightChild.elementName.equals(element)) {
            return entry.elementName;
        }
        String parent = getParent(entry.leftChild, element);
        if (parent == null) {
            parent = getParent(entry.rightChild, element);
        }

        return parent;
    }

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String set(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException();
    }

    static class Entry<T> implements Serializable {
        String elementName;
        boolean availableToAddLeftChildren;
        boolean availableToAddRightChildren;
        Entry<T> parent;
        Entry<T> leftChild;
        Entry<T> rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            availableToAddLeftChildren = true;
            availableToAddRightChildren = true;
        }

        public boolean isAvailableToAddChildren() {
            return availableToAddLeftChildren | availableToAddRightChildren;
        }
    }
}
