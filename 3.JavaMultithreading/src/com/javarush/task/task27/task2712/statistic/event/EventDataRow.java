package com.javarush.task.task27.task2712.statistic.event;

import java.util.Date;

public interface EventDataRow {

    EventType getType();

    Date getDate();

    int getTime();
}
