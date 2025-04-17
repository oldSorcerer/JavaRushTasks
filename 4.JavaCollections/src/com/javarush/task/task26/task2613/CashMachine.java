package com.javarush.task.task26.task2613;

import java.util.Locale;

public class CashMachine {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        String currencyCode = ConsoleHelper.askCurrencyCode();
        String[] digits = ConsoleHelper.getValidTwoDigits(currencyCode);
        int denomination = Integer.parseInt(digits[0]);
        int count = Integer.parseInt(digits[1]);

        CurrencyManipulator manipulator = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(currencyCode);
        manipulator.addAmount(denomination, count);

        int totalAmount = manipulator.getTotalAmount();

    }
}
