package com.javarush.task.task29.task2909.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {

    private String country;
    private String city;
    private String house;


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }
}
