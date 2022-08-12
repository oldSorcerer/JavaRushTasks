package com.javarush.task.jdk13.task41.task4115.publisher;

import com.javarush.task.jdk13.task41.task4115.listeners.NotificationListener;
import com.javarush.task.jdk13.task41.task4115.listeners.NotificationType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationManager {

    Map<NotificationType, List<NotificationListener>> listeners = new HashMap<>();

    public NotificationManager(NotificationType... types) {
        for (NotificationType type : types) {
            this.listeners.put(type, new ArrayList<>());
        }
    }

    public void subscribe(NotificationType type, NotificationListener listener) {
        listeners.get(type).add(listener);
    }

    public void unsubscribe(NotificationType notificationType, NotificationListener listener) {
        listeners.get(notificationType).remove(listener);
    }

    public void notify(NotificationType notificationType, String chainStoreName) {
        List<NotificationListener> subscribers = listeners.get(notificationType);
        for (NotificationListener subscriber : subscribers) {
            subscriber.update(notificationType, chainStoreName);
        }
    }
}
