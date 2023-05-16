package com.javarush.task.task28.task2805;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {

    private static final AtomicInteger atomicInteger = new AtomicInteger(1); //9

//    {
//        setPriority(atomicInteger.incrementAndGet() % 10 + 1);
//    }

    {
        int priority = atomicInteger.getAndIncrement();
        if (priority > MAX_PRIORITY) {
            priority = MIN_PRIORITY;
        }
        atomicInteger.set(priority);
        setPriority(atomicInteger.getAndIncrement());

        if (getThreadGroup() != null && getThreadGroup().getMaxPriority() < priority) {
            setPriority(getThreadGroup().getMaxPriority());
        }
    }

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
}
