package com.javarush.task.task35.task3511;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* 
Wildcards для коллекций
*/

public class Solution {

    public static void main(String[] args) {
    }

    public static Double sum(List<? extends Number> list) {
        double result = 0.0;
        for (Number numb : list) {
            result += numb.doubleValue();
        }
        return result;
    }

    public static Double multiply(List<? extends Number> list) {
        double result = 1.0;
        for (Number numb : list) {
            result *= numb.doubleValue();
        }
        return result;
    }

    public static String concat(List<?> list) {
        StringBuilder builder = new StringBuilder();
        for (Object obj : list) {
            builder.append(obj);
        }
        return builder.toString();
    }

    public static <T> List<T> combine(List<? extends Collection> list) {
        List<T> result = new ArrayList<>();
        for (Collection collection : list) {
            result.addAll(collection);
        }
        return result;
    }
}
