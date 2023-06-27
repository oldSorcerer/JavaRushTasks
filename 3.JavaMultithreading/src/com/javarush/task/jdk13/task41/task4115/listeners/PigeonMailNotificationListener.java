package com.javarush.task.jdk13.task41.task4115.listeners;

public class PigeonMailNotificationListener implements NotificationListener {
    private final String fullAddress;

    public PigeonMailNotificationListener(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    @Override
    public void update(NotificationType notificationType, String chainStoreName) {
        System.out.printf("\tОтправлен почтовый голубь с буклетом по адресу %s о %s в %s\n", fullAddress, notificationType, chainStoreName);
    }
}
