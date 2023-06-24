package com.javarush.task.task29.task2909.human;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class BloodGroup {

    int code;

    public static BloodGroup first() {
        return new BloodGroup(1);
    }

    public static BloodGroup second() {
        return new BloodGroup(2);
    }

    public static BloodGroup third() {
        return new BloodGroup(3);
    }

    public static BloodGroup fourth() {
        return new BloodGroup(4);
    }
}
