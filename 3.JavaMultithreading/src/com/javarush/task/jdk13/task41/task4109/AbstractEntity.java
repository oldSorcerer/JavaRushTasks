package com.javarush.task.jdk13.task41.task4109;

import java.util.Date;

public abstract class AbstractEntity {

    public int id;
    public Date createdTime;
    public Date updatedTime;

    public AbstractEntity() {
    }

    public AbstractEntity(AbstractEntity abstractEntity) {
        this.id = abstractEntity.id;
        this.createdTime = abstractEntity.createdTime;
        this.updatedTime = abstractEntity.updatedTime;
    }

    public abstract AbstractEntity clone();
}
