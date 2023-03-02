package com.javarush.task.jdk13.task28.task2806;

import java.util.HashMap;
import java.util.Map;

public class Link {
    public String protocol;
    public String address;
    public Map<String, String> parameters = new HashMap<>();

    @Override
    public String toString() {
        return "Link{" +
                "protocol='" + protocol + '\'' +
                ", address='" + address + '\'' +
                ", parameters=" + parameters +
                '}';
    }
}
