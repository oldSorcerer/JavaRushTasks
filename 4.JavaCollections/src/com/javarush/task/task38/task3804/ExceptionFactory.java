package com.javarush.task.task38.task3804;

import java.util.Objects;

public class ExceptionFactory {

    public static Throwable createExceptionFactory(Enum<?> e) {
        if (Objects.isNull(e)) {
            return new IllegalArgumentException();
        }

        String message = e.toString().replace("_", " ").toLowerCase();
        message = new StringBuilder(message).replace(0, 1, String.valueOf(e.toString().charAt(0))).toString();

        return switch (e.getClass().getSimpleName()) {
            case "ApplicationExceptionMessage" -> new Exception(message);
            case "DatabaseExceptionMessage" -> new RuntimeException(message);
            case "UserExceptionMessage" -> new Error(message);
            default -> new IllegalArgumentException();
        };
    }
}
