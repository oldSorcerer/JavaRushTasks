package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
                int index = message.indexOf(":");
                String name = message.substring(0, index);
                String text = message.substring(index + 1);


                SimpleDateFormat formatData = new SimpleDateFormat("d.MM.yyyy");
                SimpleDateFormat formatDay = new SimpleDateFormat("d");
                SimpleDateFormat formatMonth = new SimpleDateFormat("MMMM");
                SimpleDateFormat formatYear = new SimpleDateFormat("yyyy");
                SimpleDateFormat formatTime = new SimpleDateFormat("H:mm:ss");
                SimpleDateFormat formatH = new SimpleDateFormat("H");
                SimpleDateFormat formatM = new SimpleDateFormat("m");
                SimpleDateFormat formatS = new SimpleDateFormat("s");


                Calendar calendar = new GregorianCalendar();
                Date time = calendar.getTime();
                String format = formatData.format(time);

            }
        }
    }


}
