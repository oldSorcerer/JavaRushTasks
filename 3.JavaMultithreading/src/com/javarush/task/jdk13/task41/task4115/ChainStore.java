package com.javarush.task.jdk13.task41.task4115;

import com.javarush.task.jdk13.task41.task4115.publisher.NotificationManager;

import static com.javarush.task.jdk13.task41.task4115.listeners.NotificationType.*;

public class ChainStore {

    private final String name;
    public NotificationManager notifications;

    public ChainStore(String name) {
        this.name = name;
        notifications = new NotificationManager(PERSONAL_OFFER, SALE, PROMO, EVENT);
    }

    public void launchPersonalOffer() {
        System.out.println(name + " запускает соблазнительные персональные скидки!");
        notifications.notify(PERSONAL_OFFER, name);
    }

    public void launchSale() {
        System.out.println(name + " запускает горячую распродажу!");
        notifications.notify(SALE, name);
    }

    public void launchPromo() {
        System.out.println("В " + name + " стартует супер промо акция!");
        notifications.notify(PROMO, name);
    }

    public void launchEvent() {
        System.out.println("В " + name + " состоится грандиозное мероприятие!");
        notifications.notify(EVENT, name);
    }
}
