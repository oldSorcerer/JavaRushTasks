package com.javarush.task.jdk13.task41.task4103.blood;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.javarush.task.jdk13.task41.task4103.blood.BloodSample.BloodType.*;
import static com.javarush.task.jdk13.task41.task4103.blood.BloodSample.RhFactor.NEGATIVE;
import static com.javarush.task.jdk13.task41.task4103.blood.BloodSample.RhFactor.POSITIVE;

public class BloodDB implements DB {

    private static final Map<Integer, BloodSample> DB = new HashMap<>() {{
        put(122, new BloodSample(122, "Mike", "Donovan", new Object(), A, NEGATIVE));
        put(123, new BloodSample(123, "Jamie", "Jaworski", new Object(), O, POSITIVE));
        put(124, new BloodSample(124, "Matt", "Chambers", new Object(), AB, POSITIVE));
        put(125, new BloodSample(125, "Jorge", "Castillo", new Object(), O, POSITIVE));
        put(126, new BloodSample(126, "Valerie", "Castillo", new Object(), B, NEGATIVE));
        put(127, new BloodSample(127, "Emmett", "Meridian", new Object(), B, POSITIVE));
        put(128, new BloodSample(128, "Brian", "Moser", new Object(), A, NEGATIVE));
    }};

    public BloodSample getById(int id) {
        return DB.get(id);
    }

    public List<BloodSample> find(String request) {
        return DB.values().stream()
                .filter(s -> s.getUser().getFirstName().contains(request) ||
                        s.getUser().getLastName().contains(request) ||
                        s.getBloodType().name().contains(request) ||
                        s.getRhFactor().name().contains(request))
                .collect(Collectors.toList());
    }
}
