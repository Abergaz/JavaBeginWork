package ru.javabegin.training.fastjava2.OOP_12;

import ru.javabegin.training.fastjava2.OOP_12.objects.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("BMW");
        System.out.println("car.getName() = " + car.getName());
    }
}
