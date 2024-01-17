package com.javarush.task.jdk13.task28.task2804;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {

    private static final AtomicInteger ATOMIC_INTEGER = new AtomicInteger(9); //1

    {
        setPriority(ATOMIC_INTEGER.incrementAndGet() % 10 + 1);
    }

//    {
//        int priority = ATOMIC_INTEGER.getAndIncrement();
//        if (priority > MAX_PRIORITY) {
//            priority = MIN_PRIORITY;
//        }
//        ATOMIC_INTEGER.set(priority);
//        setPriority(ATOMIC_INTEGER.getAndIncrement());
//
//        if (getThreadGroup() != null && getThreadGroup().getMaxPriority() < priority) {
//            setPriority(getThreadGroup().getMaxPriority());
//        }
//    }

    public MyThread() {
        super();
    }

    public MyThread(Runnable target) {
        super(target);
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
    }

    public MyThread(String name) {
        super(name);
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
    }
    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize, boolean inheritThreadLocals) {
        super(group, target, name, stackSize, inheritThreadLocals);
    }
}