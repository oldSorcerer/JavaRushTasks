package com.javarush.task.jdk13.task41.task4115.listeners;

public class EmailNotificationListener implements NotificationListener {
    private final String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(NotificationType notificationType, String chainStoreName) {
        System.out.printf("\tОтправлено уведомление на почту %s о %s в %s\n", email, notificationType, chainStoreName);
    }
}
