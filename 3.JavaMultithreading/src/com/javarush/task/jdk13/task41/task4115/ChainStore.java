package com.javarush.task.jdk13.task41.task4115;

public class ChainStore {

    private final String name;

    public ChainStore(String name) {
        this.name = name;
    }

    public void launchPersonalOffer() {
        System.out.println(name + " запускает соблазнительные персональные скидки!");
    }

    public void launchSale() {
        System.out.println(name + " запускает горячую распродажу!");
    }

    public void launchPromo() {
        System.out.println("В " + name + " стартует супер промо акция!");
    }

    public void launchEvent() {
        System.out.println("В " + name + " состоится грандиозное мероприятие!");
    }
}
