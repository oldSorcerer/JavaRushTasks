package com.javarush.task.task35.task3505;

public class ConvertableUser implements Convertable<Integer> {
    private final Integer id;
    private final String name;

    public ConvertableUser(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Integer getKey() {
        return id;
    }

    @Override
    public String toString() {
        return "ConvertableUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
