package com.javarush.task.sql.task12.task1201;

/* 
Создаём Entity из класса
*/

public enum PublicationStatus {
    LENT,
    DUE,
    LEND_OVERDUE,
    AVAILABLE,
    LOST,
    LOST_AND_PAID,
    DAMAGED,
    DO_NOT_LEND
}
