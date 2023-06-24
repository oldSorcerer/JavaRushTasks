package com.javarush.task.task29.task2909.user;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Address {

    String country;
    String city;
    String house;

}
