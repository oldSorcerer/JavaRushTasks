package com.javarush.task.task26.task2613.command;



import com.javarush.task.task26.task2613.exception.InterruptOperationException;

import static com.javarush.task.task26.task2613.ConsoleHelper.*;

class ExitCommand implements Command {

    @Override
    public void execute() throws InterruptOperationException {
        writeMessage("Вы действительно хотите выйти? Y/N");
        String answer = readString();
        if (answer.equalsIgnoreCase("y")) {
            writeMessage("Спасибо что воспользовались нашим банкоматом. Удачного вам дня!");
        }
    }
}
