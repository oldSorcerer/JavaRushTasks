package com.javarush.task.jdk13.task41.task4105.alchemy_library;

public class Potion {

    private final String name;
    private final Type type;
    private final Size size;

    public Potion(String name) {
        this.name = name;
        int index = name.indexOf(" ");
        this.type = Type.valueOf(name.substring(index + 1, name.indexOf(" ", index + 1)).toUpperCase());
        this.size = Size.valueOf(name.substring(0, index).toUpperCase());
    }

    public Potion(String name, Type type, Size size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public Size getSize() {
        return size;
    }
}
