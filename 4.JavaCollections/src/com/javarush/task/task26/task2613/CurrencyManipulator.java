package com.javarush.task.task26.task2613;

import java.util.Map;
import java.util.TreeMap;

public class CurrencyManipulator {

    private String currencyCode;
    private Map<Integer, Integer> denominations;

    public CurrencyManipulator(String currencyCode) {
        this.currencyCode = currencyCode;
        this.denominations = new TreeMap<>();
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void addAmount(int denomination, int count) {
        denominations.merge(denomination, count, Integer::sum);
    }

    public int getTotalAmount() {
        return denominations.entrySet().stream()
                .mapToInt(entry -> (entry.getKey() * entry.getValue())).sum();
    }

    public boolean hasMoney() {
        return !denominations.isEmpty();
    }
}
