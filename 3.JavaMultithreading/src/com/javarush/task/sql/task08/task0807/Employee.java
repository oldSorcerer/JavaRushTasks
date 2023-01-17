package com.javarush.task.sql.task08.task0807;

import java.util.Objects;

public class Employee {
    private Integer id;
    private String name;
    private Integer age;
    private String smth;

    public Employee() {
    }

    public Employee(Integer id, String name, Integer age, String smth) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.smth = smth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSmth() {
        return smth;
    }

    public void setSmth(String smth) {
        this.smth = smth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", smth='" + smth + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(age, employee.age) && Objects.equals(smth, employee.smth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, smth);
    }
}
