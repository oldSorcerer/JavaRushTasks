package com.javarush.task.task25.task2503;

public interface Columnable {

    /**
     * @return полное имя колонки
     */
    String getColumnName();

    /**
     * Возвращает true, если колонка видимая, иначе false
     */
    boolean isShown();

    /**
     * Скрывает колонку - маркирует колонку -1 в массиве realOrder.
     * Сдвигает индексы отображаемых колонок, которые идут после скрытой
     */
    void hide();

    /**
     * Возвращает порядок константы в энуме.
     *
     * @return порядок константы в энуме
     */
    int ordinal();
}
