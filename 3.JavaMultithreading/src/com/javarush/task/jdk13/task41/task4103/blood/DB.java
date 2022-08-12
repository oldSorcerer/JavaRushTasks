package com.javarush.task.jdk13.task41.task4103.blood;

import java.util.List;

public interface DB {
    BloodSample getById(int id);
    List<BloodSample> find(String request);
}
