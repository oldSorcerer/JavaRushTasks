package com.javarush.task.task38.task3804;

/* 
Фабрика исключений
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static Class<?> getFactoryClass() {
        return ExceptionFactory.class;
    }

    public static void main(String[] args) {
        List<Throwable> list = new ArrayList<>();

        list.add(ExceptionFactory.createExceptionFactory(ApplicationExceptionMessage.UNHANDLED_EXCEPTION));
        list.add(ExceptionFactory.createExceptionFactory(ApplicationExceptionMessage.SOCKET_IS_CLOSED));

        list.add(ExceptionFactory.createExceptionFactory(DatabaseExceptionMessage.NO_RESULT_DUE_TO_TIMEOUT));
        list.add(ExceptionFactory.createExceptionFactory(DatabaseExceptionMessage.NOT_ENOUGH_CONNECTIONS));

        list.add(ExceptionFactory.createExceptionFactory(UserExceptionMessage.USER_DOES_NOT_HAVE_PERMISSIONS));
        list.add(ExceptionFactory.createExceptionFactory(UserExceptionMessage.USER_DOES_NOT_EXIST));

        list.add(ExceptionFactory.createExceptionFactory(TestEnum.FIRST));
        list.add(ExceptionFactory.createExceptionFactory(null));

        list.forEach(System.out::println);
    }
}