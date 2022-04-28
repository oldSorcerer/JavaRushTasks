package com.javarush.task.jdk13.task27.task2707;

public class MailServer implements Runnable {
    private Mail mail;

    public MailServer(Mail mail) {
        this.mail = mail;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        //сделайте что-то тут - do something here
        String name = Thread.currentThread().getName();
        long endTime = System.currentTimeMillis();
        System.out.format("%s MailServer received: [%s] in %d ms after start",
                name, mail.getText(), (endTime - startTime));
    }
}
