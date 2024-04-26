package com.javarush.task.jdk13.task42.task4205;

import java.util.concurrent.*;

public class Message implements Delayed {
    private final Integer messageId;
    private final String messageText;
    private final long lifetime;
    private final long endTime;

    public Message(Integer messageId, String messageText, long lifetime) {
        this.messageId = messageId;
        this.messageText = messageText;
        this.lifetime = lifetime;
        endTime = System.nanoTime() + TimeUnit.NANOSECONDS.convert(lifetime, TimeUnit.MILLISECONDS);
    }

    public Integer getMessageId() {
        return messageId;
    }

    public long getLifetime() {
        return lifetime;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(endTime - System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if (getDelay(TimeUnit.NANOSECONDS) > o.getDelay(TimeUnit.NANOSECONDS)) {
            return 1;
        } else if (getDelay(TimeUnit.NANOSECONDS) < o.getDelay(TimeUnit.NANOSECONDS)) {
            return -1;
        } else {
            return 0;
        }
//        return Long.compare(getDelay(TimeUnit.NANOSECONDS), o.getDelay(TimeUnit.NANOSECONDS));
    }
}
