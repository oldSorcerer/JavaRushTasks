package com.javarush.task.task27.task2709;

import java.util.concurrent.atomic.AtomicInteger;

public class ProducerTask implements Runnable {
    private TransferObject transferObject;
    protected volatile boolean stopped;
    static volatile AtomicInteger i = new AtomicInteger(0);

    public ProducerTask(TransferObject transferObject) {
        this.transferObject = transferObject;
        new Thread(this, "ProducerTask").start();
    }

    public void run() {
        while (!stopped) {
            transferObject.put(i.incrementAndGet());
        }
    }

    public void stop() {
        stopped = true;
    }
}
