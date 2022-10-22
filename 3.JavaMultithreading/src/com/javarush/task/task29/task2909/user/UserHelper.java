package com.javarush.task.task29.task2909.user;

import java.util.concurrent.atomic.AtomicInteger;

public class UserHelper {
    private final User userAnya = new User("Аня", "Смирнова", 10);
    private final User userRoma = new User("Рома", "Виноградов", 30);

    private final boolean isManAnya = false;
    private final boolean isManRoma = true;

    public void printUsers() {
        userAnya.printInfo();
        userAnya.printAdditionalInfo();

        userRoma.printInfo();
        userRoma.printAdditionalInfo();
    }

    public int calculateAverageAge() {
        User userUra = new User("Юра", "Карп", 28);
        return (userAnya.getAge() + userRoma.getAge() + userUra.getAge()) / 3;
    }

    public int calculateRate(AtomicInteger base, int age, boolean hasWork, boolean hasHouse) {
        int number2 = (base.get() + age / 100);
        int number3 = (int) (number2 * (hasWork ? 1.1 : 0.9));
        return (int) (number3 * (hasHouse ? 1.1 : 0.9));
    }

    public String getBossName(User user) {
        Work work = user.getWork();
        return work.getBoss();
    }
}