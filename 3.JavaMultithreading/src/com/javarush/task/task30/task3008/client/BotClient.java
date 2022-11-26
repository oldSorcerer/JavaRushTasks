package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class BotClient extends Client {

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    @Override
    protected String getUserName() {
        return "date_bot_" + (int) (Math.random() * 100);
    }

    public static void main(String[] args) {
        new BotClient().run();
    }

    public class BotSocketThread extends SocketThread {

        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
            if (message.contains(":")) {
                String name = message.split(": ")[0];
                String text = message.split(": ")[1];

                if (text.equalsIgnoreCase("дата")) {
                    sendTextMessage("Информация для " + name + ": " +
                            new SimpleDateFormat("d.MM.yyyy").format(new GregorianCalendar().getTime()));
                } else if (text.equalsIgnoreCase("день")) {
                    sendTextMessage("Информация для " + name + ": " +
                            new SimpleDateFormat("d").format(new GregorianCalendar().getTime()));
                } else if (text.equalsIgnoreCase("месяц")) {
                    sendTextMessage("Информация для " + name + ": " +
                            new SimpleDateFormat("MMMM").format(new GregorianCalendar().getTime()));
                } else if (text.equalsIgnoreCase("год")) {
                    sendTextMessage("Информация для " + name + ": " +
                            new SimpleDateFormat("yyyy").format(new GregorianCalendar().getTime()));
                } else if (text.equalsIgnoreCase("время")) {
                    sendTextMessage("Информация для " + name + ": " +
                            new SimpleDateFormat("H:mm:ss").format(new GregorianCalendar().getTime()));
                } else if (text.equalsIgnoreCase("час")) {
                    sendTextMessage("Информация для " + name + ": " +
                            new SimpleDateFormat("H").format(new GregorianCalendar().getTime()));
                } else if (text.equalsIgnoreCase("минуты")) {
                    sendTextMessage("Информация для " + name + ": " +
                            new SimpleDateFormat("m").format(new GregorianCalendar().getTime()));
                } else if (text.equalsIgnoreCase("секунды")) {
                    sendTextMessage("Информация для " + name + ": " +
                            new SimpleDateFormat("s").format(new GregorianCalendar().getTime()));
                }
            }
        }
    }


}
