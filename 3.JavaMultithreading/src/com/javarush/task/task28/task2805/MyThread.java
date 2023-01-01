package com.javarush.task.task28.task2805;

public class MyThread extends Thread {

    {
        int priority = getPriority();
        if (priority == MAX_PRIORITY) {
            priority = MIN_PRIORITY;
            setPriority(++priority);
        }
    }

    public MyThread() {
    }

    public MyThread(Runnable target) {
        super(target);
    }

    public MyThread(ThreadGroup group, String s) {
        super(group, s);
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

    public MyThread(String name) {
        super(name);
    }

//    public boolean getPriority(int min, int max) {
//        return false;
//    }
}
