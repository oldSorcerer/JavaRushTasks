package com.javarush.task.task29.task2909.user;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Setter(AccessLevel.PRIVATE)
    String name;
    String surname;
    int age;

    Address address;
    Work work;

    boolean man;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Имя: " + getName());
        System.out.println("Фамилия: " + getSurname());
    }

    public void printAdditionalInfo() {
        System.out.println("Пользователь " + (getAge() < 16 ? "моложе" : "старше") + " 16 лет");
    }

    public String getCountry() {
        return address.getCountry();
    }

    public void setCountry(String country) {
        address.setCountry(country);
    }

    public String getCity() {
        return address.getCity();
    }

    public void setCity(String city) {
        address.setCity(city);
    }

    public String getAddress() {
        return getCountry() + " " + getCity() + " " + address.getHouse();
    }

    public String getBoss() {
        return work.getBoss();
    }
}