package com.javarush.task.task26.task2604;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/* 
Для того, чтобы усовершенствовать ум, надо больше размышлять, чем заучивать
*/

public class Solution extends Thread {
    public static final String DEFAULT_JAVARUSH_THREAD_NAME = "JavaRushThread";

    private static final AtomicInteger createdThreadIndex = new AtomicInteger();
    private static final AtomicInteger aliveThreadIndex = new AtomicInteger();

    static {
        System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tF %1$tT %4$s %2$s %5$s%6$s%n");
    }

    private static final Logger log = Logger.getLogger(Solution.class.getName());

    private static volatile boolean debugSession = true;

    public Solution() {
        this(DEFAULT_JAVARUSH_THREAD_NAME);
    }

    public Solution(String name) {
        super(name + "-" + createdThreadIndex.incrementAndGet());

        setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            public void uncaughtException(Thread t, Throwable e) {
                log.log(Level.SEVERE, "An error occurred in thread " + t.getName(), e);
            }
        });
    }

    public static void main(String[] args) {
        new Solution().start();
        new Solution().start();
        new Solution().start();
    }

    public void run() {
        boolean debug = debugSession;
        if (debug) {
            log.log(Level.INFO, "Created " + getName());
        }
        try {
            aliveThreadIndex.incrementAndGet();
            log.log(Level.INFO, "Thread " + getName() + " in progress...");
            throw new RuntimeException("Oops " + getName());
        } finally {
            aliveThreadIndex.decrementAndGet();
            if (debug) {
                log.log(Level.INFO, "Exiting " + getName());
            }
        }
    }

    public static int getThreadsCreated() {
        return createdThreadIndex.get();
    }

    public static int getThreadsAlive() {
        return aliveThreadIndex.get();
    }

    public static boolean isDebug() {
        return debugSession;
    }

    public static void setDebug(boolean ds) {
        debugSession = ds;
    }
}
