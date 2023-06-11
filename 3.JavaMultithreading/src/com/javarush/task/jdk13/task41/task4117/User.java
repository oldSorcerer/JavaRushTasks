package com.javarush.task.jdk13.task41.task4117;

public class User {

    private UserDB db;
    private int id;
    private String name;
    private Mediator mediator;

    public User(UserDB db, int id, String name) {
        this.db = db;
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void send(String msg, int userId) {
        System.out.println(name + " :: исходящее сообщение : " + msg);
        User user = db.getById(userId);
        user.receive(msg);
    }

    public void receive(String msg) {
        System.out.println(name + " :: входящее сообщение : " + msg);
    }
}