package com.javarush.task.jdk13.task42.task4205;

import java.util.concurrent.*;

public class Message {
    private Integer messageId;
    private String messageText;
    private long lifetime;

    public Message(Integer messageId, String messageText, long lifetime) {
        this.messageId = messageId;
        this.messageText = messageText;
        this.lifetime = lifetime;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public long getLifetime() {
        return lifetime;
    }
}
