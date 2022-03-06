package com.javarush.task.pro.task18.task1821;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/* 
Самый дешевый автомобиль
*/

public class Solution {

    public static void main(String[] args) {
        var tesla = Stream.of(
                new Car("Model S", 94_490),
                new Car("Model 3", 50_690),
                new Car("Model X", 99_690),
                new Car("Model Y", 65_000)
        );

        var bmw = Stream.of(
                new Car("X5", 110_000),
                new Car("X3", 54_000),
                new Car("X1", 40_000),
                new Car("X6", 125_000)
        );

        Optional<Car> cheapestCar = getCheapestCar(tesla);
        cheapestCar.ifPresent(System.out::println);

        Optional<Car> cheaperCar = cheapestCar.flatMap(car -> getCheaperCar(bmw, car));
        cheaperCar.ifPresent(System.out::println);
    }

    public static Optional<Car> getCheapestCar(Stream<Car> cars) {
        return cars.min(Comparator.comparingInt(Car::getPrice));
    }

    public static Optional<Car> getCheaperCar(Stream<Car> cars, Car cheapestCar) {
        return cars.filter(x -> x.getPrice() < cheapestCar.getPrice()).findFirst();
    }
}

class Car {
    private String name;
    private Integer price;

    public Car(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Автомобиль " + name + ", цена - " + price + " USD";
    }
}
