package com.javarush.task.jdk13.task41.task4117;

public class User {

    private final Mediator mediator;
    private final int id;
    private final String name;

    public User(Mediator mediator, int id, String name) {
        this.mediator = mediator;
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void send(String msg, int userId) {
        System.out.println(name + " :: исходящее сообщение : " + msg);
        mediator.sendMessage(msg, userId);
    }

    public void receive(String msg) {
        System.out.println(name + " :: входящее сообщение : " + msg);
    }
}