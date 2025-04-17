package com.javarush.task.task26.task2613.command;

import com.javarush.task.task26.task2613.CurrencyManipulator;

import static com.javarush.task.task26.task2613.ConsoleHelper.*;
import static com.javarush.task.task26.task2613.CurrencyManipulatorFactory.*;

class InfoCommand implements Command {

    @Override
    public void execute() {
        writeMessage("Information:");
        boolean hasMoney = false;
        for (CurrencyManipulator allCurrencyManipulator : getAllCurrencyManipulators()) {
            if (allCurrencyManipulator.hasMoney()) {
                hasMoney = true;
                String currencyCode = allCurrencyManipulator.getCurrencyCode();
                int totalAmount = allCurrencyManipulator.getTotalAmount();
                writeMessage(currencyCode + " - " + totalAmount);
            }
        }
        if (!hasMoney) {
            writeMessage("No money available.");
        }
    }
}
