package com.javarush.task.task30.task3008;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Message implements Serializable {

    MessageType type;
    String data;

    public Message(MessageType type) {
        this.type = type;
        data = null;
    }
}
