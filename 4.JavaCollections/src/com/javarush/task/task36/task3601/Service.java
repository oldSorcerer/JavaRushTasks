package com.javarush.task.task36.task3601;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Service {

    public List<String> getData() {
        return new ArrayList<>(Arrays.asList(
                "First string",
                "Second string",
                "Third string"));
    }
}
