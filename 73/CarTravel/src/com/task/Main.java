package com.task;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.move(110);
        car.move(20.5);
        car.move(-50);

        System.out.println(car.getDistance()); // 80.5
    }
}