package com.javarush.task.task26.task2613.command;

import com.javarush.task.task26.task2613.CurrencyManipulator;

import static com.javarush.task.task26.task2613.ConsoleHelper.*;
import static com.javarush.task.task26.task2613.CurrencyManipulatorFactory.*;

class DepositCommand implements Command {

    @Override
    public void execute() {
        writeMessage("Depositing...");
        String currencyCode = askCurrencyCode();
        CurrencyManipulator manipulator = getManipulatorByCurrencyCode(currencyCode);

        String[] digits = getValidTwoDigits(currencyCode);

        int denomination = Integer.parseInt(digits[0]);
        int count = Integer.parseInt(digits[1]);

        manipulator.addAmount(denomination, count);
        String format = "%d %s внесено на депозит";
        writeMessage(String.format(format, (denomination * count), currencyCode));
    }
}
