package com.javarush.task.task26.task2609;

/* 
Распределение элементов по корзинам с собственным локом
*/

public class Solution {
    private static final int NUMBER_LOCKS = 12;
    private final Node[] buckets;
    private final Object[] locks;

    static class Node {
        public Node next;
        public Object key;
        public Object value;
    }

    public Solution(int numberBuckets) {
        buckets = new Node[numberBuckets];
        locks = new Object[NUMBER_LOCKS];
        for (int i = 0; i < NUMBER_LOCKS; i++) {
            locks[i] = new Object();
        }
    }

    private final int hash(Object key) {
        return Math.abs(key.hashCode() % buckets.length);
    }

    public Object get(Object key) {
        int hash = hash(key);
        synchronized (this) {
            for (Node m = buckets[hash]; m != null; m = m.next) {
                if (m.key.equals(key)) return m.value;
            }
        }
        return null;
    }

    public void clear() {
        for (int i = 0; i < buckets.length; i++) {
            synchronized (this) {
                buckets[i] = null;
            }
        }
    }

    public static void main(String[] args) {

    }
}
