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
                int index = message.indexOf(": ");
                String name = message.substring(0, index);
                String text = message.substring(index + 2);

                String format = switch (text) {
                    case "дата" -> "d.MM.yyyy";
                    case "день" -> "d";
                    case "месяц" -> "MMMM";
                    case "год" -> "yyyy";
                    case "время" -> "H:mm:ss";
                    case "час" -> "H";
                    case "минуты" -> "m";
                    case "секунды" -> "s";
                    default -> null;
                };

                if (format != null) {
                    sendTextMessage("Информация для " + name + ": " + new SimpleDateFormat(format).format(new GregorianCalendar().getTime()));
                }
            }
        }
    }
}
