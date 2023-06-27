package com.javarush.task.jdk13.task41.task4115.listeners;

public class FirebasePushNotificationListener implements NotificationListener {
    private final String token;

    public FirebasePushNotificationListener(String token) {
        this.token = token;
    }

    @Override
    public void update(NotificationType notificationType, String chainStoreName) {
        System.out.printf("\tОтправлено пуш-уведомление в андроид-приложение по токену %s о %s в %s\n", token, notificationType, chainStoreName);
    }
}
